package tmp.generated_capprox;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class TypeDef_ extends CodeUnit_TopLevel {
  public TypeDef_(TypeDef typeDef, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<TypeDef>("typeDef", typeDef)
    }, firstToken, lastToken);
  }
  public TypeDef_(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new TypeDef_(cloneProperties(),firstToken,lastToken);
  }
  public TypeDef getTypeDef() {
    return ((PropertyOne<TypeDef>)getProperty("typeDef")).getValue();
  }
}
