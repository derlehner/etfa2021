package at.ast.jsonGen;

import DTML.Command;
import DTML.CommandPayload;
import DTML.Component;
import DTML.ComponentContent;
import DTML.ComponentInstance;
import DTML.DTContent;
import DTML.DTElement;
import DTML.DTMI;
import DTML.DataPoint;
import DTML.DigitalTwin;
import DTML.DigitalTwinEnvironment;
import DTML.Interface;
import DTML.InterfaceContent;
import DTML.Property;
import DTML.PropertyInstance;
import DTML.Relationship;
import DTML.RelationshipInstance;
import DTML.Schema;
import DTML.Telemetry;
import DTML.Type;
import DTML.Unit;
import DTML.impl.RelationshipInstanceImpl;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimulatorGenerator implements IGenerator {
  protected CharSequence _serialize(final DTMI dtmi) {
    StringConcatenation _builder = new StringConcatenation();
    String _scheme = dtmi.getScheme();
    _builder.append(_scheme);
    _builder.append(":");
    String _path = dtmi.getPath();
    _builder.append(_path);
    _builder.append(";");
    int _version = dtmi.getVersion();
    _builder.append(_version);
    return _builder;
  }
  
  protected CharSequence _serialize(final DTElement ic) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _displayName = ic.getDisplayName();
      boolean _tripleNotEquals = (_displayName != null);
      if (_tripleNotEquals) {
        _builder.append("\"displayName\": \"");
        String _displayName_1 = ic.getDisplayName();
        _builder.append(_displayName_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _comment = ic.getComment();
      boolean _tripleNotEquals_1 = (_comment != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"comment\": \"");
        String _comment_1 = ic.getComment();
        _builder.append(_comment_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _description = ic.getDescription();
      boolean _tripleNotEquals_2 = (_description != null);
      if (_tripleNotEquals_2) {
        _builder.append("\"description\": \"");
        String _description_1 = ic.getDescription();
        _builder.append(_description_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      DTMI _id = ic.getId();
      boolean _tripleNotEquals_3 = (_id != null);
      if (_tripleNotEquals_3) {
        _builder.append("\"@id\": \"");
        Object _serialize = this.serialize(ic.getId());
        _builder.append(_serialize);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateJson(final Interface interf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": \"Interface\",");
    _builder.newLine();
    CharSequence _serialize = this.serialize(((DTElement) interf));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    {
      int _size = interf.getContents().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\"contents\":[");
        _builder.newLine();
        {
          int _size_1 = interf.getContents().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            InterfaceContent cont = interf.getContents().get((i).intValue());
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t\t");
            Object _generateJson = this.generateJson(cont);
            _builder.append(_generateJson, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("}");
            CharSequence _xifexpression = null;
            int _size_2 = interf.getContents().size();
            int _minus = (_size_2 - 1);
            boolean _lessThan = ((i).intValue() < _minus);
            if (_lessThan) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(",");
              _xifexpression = _builder_1;
            }
            _builder.append(_xifexpression, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\"@context\": \"dtmi:dtdl:context;2\"");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateJson(final Relationship rel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": \"Relationship\",");
    _builder.newLine();
    CharSequence _serialize = this.serialize(((DTElement) rel));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    {
      Interface _target = rel.getTarget();
      boolean _tripleNotEquals = (_target != null);
      if (_tripleNotEquals) {
        _builder.append("\"target\": \"");
        CharSequence _serialize_1 = this.serialize(rel.getTarget().getId());
        _builder.append(_serialize_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _maxMultiplicity = rel.getMaxMultiplicity();
      boolean _greaterEqualsThan = (_maxMultiplicity >= 0);
      if (_greaterEqualsThan) {
        _builder.append("\"maxMultiplicity\": ");
        int _maxMultiplicity_1 = rel.getMaxMultiplicity();
        _builder.append(_maxMultiplicity_1);
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\"minMultiplicity\": ");
    int _minMultiplicity = rel.getMinMultiplicity();
    _builder.append(_minMultiplicity);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"writable\": ");
    boolean _isWritable = rel.isWritable();
    _builder.append(_isWritable);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties = rel.getProperties();
      boolean _tripleNotEquals_1 = (_properties != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"properties\": [");
        _builder.newLine();
        {
          int _size = rel.getProperties().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for(final Integer i : _doubleDotLessThan) {
            _builder.append("\t");
            Property prop = rel.getProperties().get((i).intValue());
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            Object _generateJson = this.generateJson(prop);
            _builder.append(_generateJson, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            CharSequence _xifexpression = null;
            int _size_1 = rel.getProperties().size();
            int _minus = (_size_1 - 1);
            boolean _lessThan = ((i).intValue() < _minus);
            if (_lessThan) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(",");
              _xifexpression = _builder_1;
            }
            _builder.append(_xifexpression, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\"name\": \"");
    String _name = rel.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateJson(final Component comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": \"Component\",");
    _builder.newLine();
    _builder.append("\"name\": \"");
    String _name = comp.getName();
    _builder.append(_name);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    CharSequence _serialize = this.serialize(((DTElement) comp));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    _builder.append("\"schema\": \"");
    CharSequence _serialize_1 = this.serialize(comp.getSchema().getId());
    _builder.append(_serialize_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateJson(final Telemetry tel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"Telemetry\"");
    {
      Type _type = tel.getType();
      boolean _tripleNotEquals = (_type != Type.NONE);
      if (_tripleNotEquals) {
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"");
        Type _type_1 = tel.getType();
        _builder.append(_type_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("],");
    _builder.newLine();
    _builder.append("\"schema\": \"");
    Schema _schema = tel.getSchema();
    _builder.append(_schema);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    CharSequence _serialize = this.serialize(((DTElement) tel));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    {
      Unit _unit = tel.getUnit();
      boolean _tripleNotEquals_1 = (_unit != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"unit\": \"");
        Unit _unit_1 = tel.getUnit();
        _builder.append(_unit_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\"name\": \"");
    String _name = tel.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateJson(final Property prop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"Property\"");
    {
      Type _type = prop.getType();
      boolean _tripleNotEquals = (_type != Type.NONE);
      if (_tripleNotEquals) {
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"");
        Type _type_1 = prop.getType();
        _builder.append(_type_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("],");
    _builder.newLine();
    _builder.append("\"schema\": \"");
    Schema _schema = prop.getSchema();
    _builder.append(_schema);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    CharSequence _serialize = this.serialize(((DTElement) prop));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    {
      Unit _unit = prop.getUnit();
      boolean _tripleNotEquals_1 = (_unit != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"unit\": \"");
        Unit _unit_1 = prop.getUnit();
        _builder.append(_unit_1);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\"name\": \"");
    String _name = prop.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateJson(final Command com) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"@type\": [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"Command\"");
    _builder.newLine();
    _builder.append("],");
    _builder.newLine();
    CharSequence _serialize = this.serialize(((DTElement) com));
    _builder.append(_serialize);
    _builder.newLineIfNotEmpty();
    {
      EList<CommandPayload> _request = com.getRequest();
      boolean _tripleNotEquals = (_request != null);
      if (_tripleNotEquals) {
        _builder.append("\"request\": ");
        Object _generateJson = this.generateJson(com.getRequest().get(0));
        _builder.append(_generateJson);
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<CommandPayload> _response = com.getResponse();
      boolean _tripleNotEquals_1 = (_response != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"response\": ");
        Object _generateJson_1 = this.generateJson(com.getRequest().get(0));
        _builder.append(_generateJson_1);
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\"name\": \"");
    String _name = com.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateJson(final CommandPayload cp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      String _displayName = cp.getDisplayName();
      boolean _tripleNotEquals = (_displayName != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("\"displayName\": \"");
        String _displayName_1 = cp.getDisplayName();
        _builder.append(_displayName_1, "\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _comment = cp.getComment();
      boolean _tripleNotEquals_1 = (_comment != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        _builder.append("\"comment\": \"");
        String _comment_1 = cp.getComment();
        _builder.append(_comment_1, "\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _description = cp.getDescription();
      boolean _tripleNotEquals_2 = (_description != null);
      if (_tripleNotEquals_2) {
        _builder.append("\t");
        _builder.append("\"description\": \"");
        String _description_1 = cp.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("\"name\": \"");
    String _name = cp.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"schema\": \"");
    Schema _schema = cp.getSchema();
    _builder.append(_schema, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _generateJson(final DigitalTwin dt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"dtid\": \"");
    String _name = dt.getName();
    _builder.append(_name);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"content\": {");
    _builder.newLine();
    {
      EList<DTContent> _contents = dt.getContents();
      for(final DTContent cont : _contents) {
        {
          Class<? extends DTContent> _class = cont.getClass();
          boolean _notEquals = (!Objects.equal(_class, RelationshipInstanceImpl.class));
          if (_notEquals) {
            _builder.append("\t");
            CharSequence _serialize = this.serialize(cont);
            _builder.append(_serialize, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("\"$metadata\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"$model\": \"");
    DTMI _id = dt.getType().getId();
    _builder.append(_id, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}, ");
    _builder.newLine();
    _builder.append("\"relationships\": [");
    _builder.newLine();
    {
      EList<DTContent> _contents_1 = dt.getContents();
      for(final DTContent cont_1 : _contents_1) {
        {
          Class<? extends DTContent> _class_1 = cont_1.getClass();
          boolean _equals = Objects.equal(_class_1, RelationshipInstanceImpl.class);
          if (_equals) {
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _serialize_1 = this.serialize(cont_1);
            _builder.append(_serialize_1, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _serialize(final RelationshipInstance relInst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"id\": \"");
    String _name = relInst.getName();
    _builder.append(_name);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"content\": {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"$targetId\": \"");
    String _name_1 = relInst.getTarget().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"relationshipName\": \"");
    String _name_2 = relInst.getType().getName();
    _builder.append(_name_2, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _serialize(final PropertyInstance propInst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = propInst.getName();
    _builder.append(_name);
    _builder.append("\": \"");
    DataPoint _value = propInst.getValue();
    _builder.append(_value);
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _serialize(final ComponentInstance compInst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = compInst.getType().getName();
    _builder.append(_name);
    _builder.append("\": {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"$metadata\": {},");
    _builder.newLine();
    {
      int _size = compInst.getContents().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for(final Integer i : _doubleDotLessThan) {
        ComponentContent cont = compInst.getContents().get((i).intValue());
        _builder.newLineIfNotEmpty();
        Object _serialize = this.serialize(cont);
        _builder.append(_serialize);
        _builder.newLineIfNotEmpty();
        CharSequence _xifexpression = null;
        int _size_1 = compInst.getContents().size();
        int _minus = (_size_1 - 1);
        boolean _lessThan = ((i).intValue() < _minus);
        if (_lessThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(",");
          _xifexpression = _builder_1;
        }
        _builder.append(_xifexpression);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    final Function1<EObject, Boolean> _function = (EObject o) -> {
      return Boolean.valueOf((o instanceof DigitalTwinEnvironment));
    };
    EObject _findFirst = IterableExtensions.<EObject>findFirst(input.getContents(), _function);
    final DigitalTwinEnvironment root = ((DigitalTwinEnvironment) _findFirst);
    final Function1<Interface, Boolean> _function_1 = (Interface o) -> {
      return Boolean.valueOf((o instanceof Interface));
    };
    final Consumer<Interface> _function_2 = (Interface o) -> {
      final Interface temp = ((Interface) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _generateJson = this.generateJson(temp);
      _builder.append(_generateJson, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final String content = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      String _displayName = temp.getDisplayName();
      _builder_1.append(_displayName);
      _builder_1.append(".json");
      fsa.generateFile(_builder_1.toString(), content);
    };
    IterableExtensions.<Interface>filter(root.getTypes(), _function_1).forEach(_function_2);
    final Function1<DigitalTwin, Boolean> _function_3 = (DigitalTwin o) -> {
      return Boolean.valueOf((o instanceof DigitalTwin));
    };
    final Consumer<DigitalTwin> _function_4 = (DigitalTwin o) -> {
      final DigitalTwin temp = ((DigitalTwin) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _generateJson = this.generateJson(temp);
      _builder.append(_generateJson, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final String content = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name = temp.getName();
      _builder_1.append(_name);
      _builder_1.append(".json");
      fsa.generateFile(_builder_1.toString(), content);
    };
    IterableExtensions.<DigitalTwin>filter(root.getInstances(), _function_3).forEach(_function_4);
  }
  
  public CharSequence serialize(final EObject compInst) {
    if (compInst instanceof ComponentInstance) {
      return _serialize((ComponentInstance)compInst);
    } else if (compInst instanceof PropertyInstance) {
      return _serialize((PropertyInstance)compInst);
    } else if (compInst instanceof RelationshipInstance) {
      return _serialize((RelationshipInstance)compInst);
    } else if (compInst instanceof DTElement) {
      return _serialize((DTElement)compInst);
    } else if (compInst instanceof DTMI) {
      return _serialize((DTMI)compInst);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(compInst).toString());
    }
  }
  
  public CharSequence generateJson(final EObject com) {
    if (com instanceof Command) {
      return _generateJson((Command)com);
    } else if (com instanceof Component) {
      return _generateJson((Component)com);
    } else if (com instanceof Property) {
      return _generateJson((Property)com);
    } else if (com instanceof Relationship) {
      return _generateJson((Relationship)com);
    } else if (com instanceof Telemetry) {
      return _generateJson((Telemetry)com);
    } else if (com instanceof Interface) {
      return _generateJson((Interface)com);
    } else if (com instanceof CommandPayload) {
      return _generateJson((CommandPayload)com);
    } else if (com instanceof DigitalTwin) {
      return _generateJson((DigitalTwin)com);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(com).toString());
    }
  }
}
