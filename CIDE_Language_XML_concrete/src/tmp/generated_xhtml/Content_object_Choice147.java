package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_object_Choice147 extends Content_object_Choice1 {
  public Content_object_Choice147(Element_select element_select, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_select>("element_select", element_select)
    }, firstToken, lastToken);
  }
  public Content_object_Choice147(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_object_Choice147(cloneProperties(),firstToken,lastToken);
  }
  public Element_select getElement_select() {
    return ((PropertyOne<Element_select>)getProperty("element_select")).getValue();
  }
}
