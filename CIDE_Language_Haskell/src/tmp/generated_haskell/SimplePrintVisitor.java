package tmp.generated_haskell;

import java.util.*;
import cide.gast.*;

import java.io.PrintStream;

import cide.languages.*;

public class SimplePrintVisitor extends AbstractPrintVisitor implements ILanguagePrintVisitor {
	public SimplePrintVisitor(PrintStream out) {
		super(out);
	}
	public SimplePrintVisitor() {
		super();
	}
	public boolean visit(ASTNode node) {
		if (node instanceof ASTStringNode){
			printToken(((ASTStringNode)node).getValue());
			return false;
		}
		if (node instanceof ASTTextNode){
			return false;
		}
		if (node instanceof module) {
			module n = (module)node;
			{
				moduleHeader v=n.getModuleHeader();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("{");
			hintIncIndent();
			hintNewLine();
			{
				body v=n.getBody();
				if (v!=null) {
					v.accept(this);
				}
			}
			hintDecIndent();
			hintNewLine();
			printToken("}");
			return false;
		}
		if (node instanceof body1) {
			body1 n = (body1)node;
			Iterator<importDecl> listElements = n.getImportDecl().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				hintNewLine();
				hintNewLine();
				listElements.next().accept(this);
			}
			{
				definitions v=n.getDefinitions();
				if (v!=null) {
					printToken(";");
					hintNewLine();
					hintNewLine();
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof body2) {
			body2 n = (body2)node;
			{
				definitions v=n.getDefinitions1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof moduleHeader) {
			moduleHeader n = (moduleHeader)node;
			printToken("module");
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				exports v=n.getExports();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("where");
			hintNewLine();
			return false;
		}
		if (node instanceof exports) {
			exports n = (exports)node;
			printToken("(");
			{
				exportList v=n.getExportList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof importDecl) {
			importDecl n = (importDecl)node;
			printToken("import");
			{
				ASTTextNode v=n.getText1();
				if (v!=null) {
					printToken("qualified");
					v.accept(this);
				}
			}
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				naam v=n.getNaam1();
				if (v!=null) {
					printToken("as");
					v.accept(this);
				}
			}
			{
				hiding v=n.getHiding();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof hiding) {
			hiding n = (hiding)node;
			{
				ASTTextNode v=n.getText2();
				if (v!=null) {
					printToken("hiding");
					v.accept(this);
				}
			}
			printToken("(");
			{
				exportList v=n.getExportList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof exportList) {
			exportList n = (exportList)node;
			Iterator<export> listElements = n.getExport().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof export1) {
			export1 n = (export1)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof export2) {
			export2 n = (export2)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				exportNaamParam v=n.getExportNaamParam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof export3) {
			export3 n = (export3)node;
			printToken("module");
			{
				naam v=n.getNaam1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exportNaamParam1) {
			exportNaamParam1 n = (exportNaamParam1)node;
			printToken("(");
			printToken("..");
			printToken(")");
			return false;
		}
		if (node instanceof exportNaamParam2) {
			exportNaamParam2 n = (exportNaamParam2)node;
			printToken("(");
			{
				naamOrVarList v=n.getNaamOrVarList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof naamOrVarList) {
			naamOrVarList n = (naamOrVarList)node;
			Iterator<naamOrVar> listElements = n.getNaamOrVar().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof naamOrVar1) {
			naamOrVar1 n = (naamOrVar1)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof naamOrVar2) {
			naamOrVar2 n = (naamOrVar2)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof definitions) {
			definitions n = (definitions)node;
			Iterator<definition> listElements = n.getDefinition().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				hintNewLine();
				hintNewLine();
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof typedecl) {
			typedecl n = (typedecl)node;
			printToken("type");
			{
				simpletype v=n.getSimpletype();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof datadecl) {
			datadecl n = (datadecl)node;
			printToken("data");
			{
				context v=n.getContext();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				simpletype v=n.getSimpletype1();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				constrs v=n.getConstrs();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				deriving v=n.getDeriving();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof newtypedecl) {
			newtypedecl n = (newtypedecl)node;
			printToken("newtype");
			{
				context v=n.getContext1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				simpletype v=n.getSimpletype2();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				newtypeParam v=n.getNewtypeParam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				deriving v=n.getDeriving1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof classdecl) {
			classdecl n = (classdecl)node;
			printToken("class");
			{
				context v=n.getContext2();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				naam v=n.getNaam1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				whereDecls v=n.getWhereDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof instancedecl) {
			instancedecl n = (instancedecl)node;
			printToken("instance");
			{
				context v=n.getContext3();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				naam v=n.getNaam2();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				inst v=n.getInst();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				whereDecls v=n.getWhereDecls1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof defaultdecl) {
			defaultdecl n = (defaultdecl)node;
			printToken("default");
			{
				functiontypeList v=n.getFunctiontypeList();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof definition7) {
			definition7 n = (definition7)node;
			{
				declaration v=n.getDeclaration();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof simpletype) {
			simpletype n = (simpletype)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (var v : n.getVar()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof constrs) {
			constrs n = (constrs)node;
			Iterator<constr> listElements = n.getConstr().iterator();
			hintIncIndent();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken("|");
				hintNewLine();
				listElements.next().accept(this);
			}
			hintDecIndent();
			return false;
		}
		if (node instanceof constr1) {
			constr1 n = (constr1)node;
			Iterator<vt> listElements = n.getVt().iterator();
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("{");
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				listElements.next().accept(this);
			}
			printToken("}");
			return false;
		}
		if (node instanceof constr2) {
			constr2 n = (constr2)node;
			for (type v : n.getType()) {
				v.accept(this);
			}
			{
				operator v=n.getOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (type v : n.getType1()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof constr3) {
			constr3 n = (constr3)node;
			{
				naam v=n.getNaam1();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (type v : n.getType2()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof vt) {
			vt n = (vt)node;
			{
				varList v=n.getVarList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("::");
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof deriving1) {
			deriving1 n = (deriving1)node;
			hintNewLine();
			printToken("deriving");
			printToken("(");
			{
				naamList v=n.getNaamList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof deriving2) {
			deriving2 n = (deriving2)node;
			hintNewLine();
			printToken("deriving");
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof newtypeParam1) {
			newtypeParam1 n = (newtypeParam1)node;
			printToken("{");
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("::");
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("}");
			return false;
		}
		if (node instanceof newtypeParam2) {
			newtypeParam2 n = (newtypeParam2)node;
			{
				type v=n.getType();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof inst1) {
			inst1 n = (inst1)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof inst2) {
			inst2 n = (inst2)node;
			printToken("(");
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("->");
			{
				var v=n.getVar1();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof inst3) {
			inst3 n = (inst3)node;
			Iterator<var> listElements = n.getVar2().iterator();
			printToken("(");
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			printToken(")");
			return false;
		}
		if (node instanceof inst4) {
			inst4 n = (inst4)node;
			printToken("(");
			{
				simpletype v=n.getSimpletype();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof inst5) {
			inst5 n = (inst5)node;
			printToken("[");
			{
				var v=n.getVar4();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("]");
			return false;
		}
		if (node instanceof decls) {
			decls n = (decls)node;
			printToken("{");
			hintIncIndent();
			{
				declarationList v=n.getDeclarationList();
				if (v!=null) {
					v.accept(this);
				}
			}
			hintDecIndent();
			printToken("}");
			return false;
		}
		if (node instanceof declarationList) {
			declarationList n = (declarationList)node;
			Iterator<declaration> listElements = n.getDeclaration().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				hintNewLine();
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof declaration1) {
			declaration1 n = (declaration1)node;
			{
				function v=n.getFunction();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				whereDecls v=n.getWhereDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration2) {
			declaration2 n = (declaration2)node;
			{
				function v=n.getFunction1();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (altExprAss v : n.getAltExprAss()) {
				v.accept(this);
			}
			{
				whereDecls v=n.getWhereDecls1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration3) {
			declaration3 n = (declaration3)node;
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				whereDecls v=n.getWhereDecls2();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration4) {
			declaration4 n = (declaration4)node;
			{
				patr v=n.getPatr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (altExprAss v : n.getAltExprAss1()) {
				v.accept(this);
			}
			{
				whereDecls v=n.getWhereDecls3();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration5) {
			declaration5 n = (declaration5)node;
			{
				varList v=n.getVarList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("::");
			{
				context v=n.getContext();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration6) {
			declaration6 n = (declaration6)node;
			printToken("infix");
			{
				ASTStringNode v=n.getInteger();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				operatorList v=n.getOperatorList();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration7) {
			declaration7 n = (declaration7)node;
			printToken("infixl");
			{
				ASTStringNode v=n.getInteger1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				operatorList v=n.getOperatorList1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof declaration8) {
			declaration8 n = (declaration8)node;
			printToken("infixr");
			{
				ASTStringNode v=n.getInteger2();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				operatorList v=n.getOperatorList2();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof altExprAss) {
			altExprAss n = (altExprAss)node;
			printToken("|");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof function1) {
			function1 n = (function1)node;
			Iterator<patroon> listElements = n.getPatroon().iterator();
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof function2) {
			function2 n = (function2)node;
			printToken("(");
			{
				function v=n.getFunction();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			for (patroon v : n.getPatroon2()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof function3) {
			function3 n = (function3)node;
			{
				patroon v=n.getPatroon3();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				operator v=n.getOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof whereDecls) {
			whereDecls n = (whereDecls)node;
			printToken("where");
			hintIncIndent();
			hintNewLine();
			{
				decls v=n.getDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			hintDecIndent();
			return false;
		}
		if (node instanceof expressie1) {
			expressie1 n = (expressie1)node;
			{
				literal v=n.getLiteral();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof expressie2) {
			expressie2 n = (expressie2)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				contrExprParam v=n.getContrExprParam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof expressie3) {
			expressie3 n = (expressie3)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				contrExprParam v=n.getContrExprParam1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof expressie4) {
			expressie4 n = (expressie4)node;
			printToken("(");
			{
				operator v=n.getOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof expressie5) {
			expressie5 n = (expressie5)node;
			printToken("(");
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				operator v=n.getOperator1();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof expressie6) {
			expressie6 n = (expressie6)node;
			printToken("(");
			{
				exprList v=n.getExprList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof expressie7) {
			expressie7 n = (expressie7)node;
			printToken("[");
			{
				exprListSpecial v=n.getExprListSpecial();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("]");
			return false;
		}
		if (node instanceof contrExprParam) {
			contrExprParam n = (contrExprParam)node;
			Iterator<contrExprAssign> listElements = n.getContrExprAssign().iterator();
			printToken("{");
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			printToken("}");
			return false;
		}
		if (node instanceof contrExprAssign) {
			contrExprAssign n = (contrExprAssign)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof expr) {
			expr n = (expr)node;
			{
				exprMain v=n.getExprMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (exprOperator v : n.getExprOperator()) {
				v.accept(this);
			}
			{
				exprEnd v=n.getExprEnd();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprEnd) {
			exprEnd n = (exprEnd)node;
			printToken("::");
			{
				context v=n.getContext();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprMain1) {
			exprMain1 n = (exprMain1)node;
			for (expressie v : n.getExpressie()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof exprMain2) {
			exprMain2 n = (exprMain2)node;
			printToken("-");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprMain3) {
			exprMain3 n = (exprMain3)node;
			printToken("\\");
			for (patroon v : n.getPatroon()) {
				v.accept(this);
			}
			printToken("->");
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprMain4) {
			exprMain4 n = (exprMain4)node;
			printToken("if");
			{
				expr v=n.getExpr2();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("then");
			{
				expr v=n.getExpr3();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("else");
			{
				expr v=n.getExpr4();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprMain5) {
			exprMain5 n = (exprMain5)node;
			Iterator<caseInner> listElements = n.getCaseInner().iterator();
			printToken("case");
			{
				expr v=n.getExpr5();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("of");
			printToken("{");
			hintIncIndent();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				hintNewLine();
				listElements.next().accept(this);
			}
			hintDecIndent();
			printToken("}");
			return false;
		}
		if (node instanceof exprMain6) {
			exprMain6 n = (exprMain6)node;
			printToken("let");
			{
				decls v=n.getDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("in");
			{
				expr v=n.getExpr6();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprMain7) {
			exprMain7 n = (exprMain7)node;
			printToken("do");
			printToken("{");
			{
				altSpecialSemiList v=n.getAltSpecialSemiList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("}");
			return false;
		}
		if (node instanceof exprOperator) {
			exprOperator n = (exprOperator)node;
			{
				operator v=n.getOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprList) {
			exprList n = (exprList)node;
			Iterator<expr> listElements = n.getExpr().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof exprListSpecial1) {
			exprListSpecial1 n = (exprListSpecial1)node;
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("|");
			{
				altSpecialList v=n.getAltSpecialList();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprListSpecial2) {
			exprListSpecial2 n = (exprListSpecial2)node;
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				expr v=n.getExpr2();
				if (v!=null) {
					printToken(",");
					v.accept(this);
				}
			}
			printToken("..");
			{
				expr v=n.getExpr3();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof exprListSpecial3) {
			exprListSpecial3 n = (exprListSpecial3)node;
			{
				expr v=n.getExpr4();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (expr v : n.getExpr5()) {
				printToken(",");
				v.accept(this);
			}
			return false;
		}
		if (node instanceof altSpecialSemiList) {
			altSpecialSemiList n = (altSpecialSemiList)node;
			Iterator<altSpecial> listElements = n.getAltSpecial().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(";");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof altSpecialList) {
			altSpecialList n = (altSpecialList)node;
			Iterator<altSpecial> listElements = n.getAltSpecial().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof altSpecial1) {
			altSpecial1 n = (altSpecial1)node;
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("<-");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof altSpecial2) {
			altSpecial2 n = (altSpecial2)node;
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof altSpecial3) {
			altSpecial3 n = (altSpecial3)node;
			printToken("let");
			{
				decls v=n.getDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof caseInner1) {
			caseInner1 n = (caseInner1)node;
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("->");
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				whereDecls v=n.getWhereDecls();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof caseInner2) {
			caseInner2 n = (caseInner2)node;
			hintIncIndent();
			{
				patr v=n.getPatr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (caseInnerAlt v : n.getCaseInnerAlt()) {
				v.accept(this);
			}
			hintDecIndent();
			{
				whereDecls v=n.getWhereDecls1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof caseInnerAlt) {
			caseInnerAlt n = (caseInnerAlt)node;
			printToken("|");
			hintNewLine();
			{
				expr v=n.getExpr();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("->");
			{
				expr v=n.getExpr1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patr) {
			patr n = (patr)node;
			{
				patrMain v=n.getPatrMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (patrOp v : n.getPatrOp()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof patrOp) {
			patrOp n = (patrOp)node;
			{
				constructorOperator v=n.getConstructorOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patrMain1) {
			patrMain1 n = (patrMain1)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (patroon v : n.getPatroon()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof patrMain2) {
			patrMain2 n = (patrMain2)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("+");
			{
				ASTStringNode v=n.getInteger();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patrMain3) {
			patrMain3 n = (patrMain3)node;
			{
				patroon v=n.getPatroon1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patroon) {
			patroon n = (patroon)node;
			for (patroonPrefix v : n.getPatroonPrefix()) {
				v.accept(this);
			}
			{
				patroonMain v=n.getPatroonMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patroonPrefix1) {
			patroonPrefix1 n = (patroonPrefix1)node;
			printToken("~");
			return false;
		}
		if (node instanceof patroonPrefix2) {
			patroonPrefix2 n = (patroonPrefix2)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("@");
			return false;
		}
		if (node instanceof patroonMain1) {
			patroonMain1 n = (patroonMain1)node;
			printToken("_");
			return false;
		}
		if (node instanceof patroonMain2) {
			patroonMain2 n = (patroonMain2)node;
			{
				ASTTextNode v=n.getText6();
				if (v!=null) {
					printToken("-");
					v.accept(this);
				}
			}
			{
				literal v=n.getLiteral();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patroonMain3) {
			patroonMain3 n = (patroonMain3)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof constructorNaam) {
			constructorNaam n = (constructorNaam)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				contrPatrParam v=n.getContrPatrParam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof patroonMain5) {
			patroonMain5 n = (patroonMain5)node;
			printToken("(");
			{
				patrList v=n.getPatrList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof patroonMain6) {
			patroonMain6 n = (patroonMain6)node;
			printToken("[");
			{
				patrList v=n.getPatrList1();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("]");
			return false;
		}
		if (node instanceof patrList) {
			patrList n = (patrList)node;
			Iterator<patr> listElements = n.getPatr().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof contrPatrParam) {
			contrPatrParam n = (contrPatrParam)node;
			Iterator<contrPatrAssign> listElements = n.getContrPatrAssign().iterator();
			printToken("{");
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			printToken("}");
			return false;
		}
		if (node instanceof contrPatrAssign) {
			contrPatrAssign n = (contrPatrAssign)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=");
			{
				patr v=n.getPatr();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof type1) {
			type1 n = (type1)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof type2) {
			type2 n = (type2)node;
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof type3) {
			type3 n = (type3)node;
			printToken("(");
			{
				functiontypeList v=n.getFunctiontypeList();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof type4) {
			type4 n = (type4)node;
			printToken("[");
			{
				functiontype v=n.getFunctiontype();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("]");
			return false;
		}
		if (node instanceof functiontypeList) {
			functiontypeList n = (functiontypeList)node;
			Iterator<functiontype> listElements = n.getFunctiontype().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof functiontype) {
			functiontype n = (functiontype)node;
			Iterator<paramtype> listElements = n.getParamtype().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken("->");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof paramtype) {
			paramtype n = (paramtype)node;
			for (type v : n.getType()) {
				v.accept(this);
			}
			return false;
		}
		if (node instanceof context1) {
			context1 n = (context1)node;
			{
				klasse v=n.getKlasse();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("=>");
			return false;
		}
		if (node instanceof context2) {
			context2 n = (context2)node;
			Iterator<klasse> listElements = n.getKlasse1().iterator();
			printToken("(");
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			printToken(")");
			printToken("=>");
			return false;
		}
		if (node instanceof klasse) {
			klasse n = (klasse)node;
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				klasseTypeVar v=n.getKlasseTypeVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof klasseTypeVar1) {
			klasseTypeVar1 n = (klasseTypeVar1)node;
			printToken("(");
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			for (type v : n.getType()) {
				v.accept(this);
			}
			printToken(")");
			return false;
		}
		if (node instanceof klasseTypeVar2) {
			klasseTypeVar2 n = (klasseTypeVar2)node;
			{
				var v=n.getVar1();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varList) {
			varList n = (varList)node;
			Iterator<var> listElements = n.getVar().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof var) {
			var n = (var)node;
			{
				ModuleNaamPrefix v=n.getModuleNaamPrefix();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				varMain v=n.getVarMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varMain1) {
			varMain1 n = (varMain1)node;
			{
				ASTStringNode v=n.getVariable_id();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varMain2) {
			varMain2 n = (varMain2)node;
			printToken("`");
			{
				varOperator v=n.getVarOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("`");
			return false;
		}
		if (node instanceof naamList) {
			naamList n = (naamList)node;
			Iterator<naam> listElements = n.getNaam().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof naam) {
			naam n = (naam)node;
			{
				ModuleNaamPrefix v=n.getModuleNaamPrefix();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				naamMain v=n.getNaamMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof naamMain1) {
			naamMain1 n = (naamMain1)node;
			{
				ASTStringNode v=n.getConstructor_id();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof naamMain2) {
			naamMain2 n = (naamMain2)node;
			printToken("`");
			{
				constructorOperator v=n.getConstructorOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken("`");
			return false;
		}
		if (node instanceof operatorList) {
			operatorList n = (operatorList)node;
			Iterator<operator> listElements = n.getOperator().iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			return false;
		}
		if (node instanceof operator1) {
			operator1 n = (operator1)node;
			{
				varOperator v=n.getVarOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof operator2) {
			operator2 n = (operator2)node;
			{
				constructorOperator v=n.getConstructorOperator();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varOperator) {
			varOperator n = (varOperator)node;
			{
				ModuleNaamPrefix v=n.getModuleNaamPrefix();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				varOperatorMain v=n.getVarOperatorMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varOperatorMain1) {
			varOperatorMain1 n = (varOperatorMain1)node;
			{
				ASTStringNode v=n.getVarsym();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varOperatorMain2) {
			varOperatorMain2 n = (varOperatorMain2)node;
			{
				otherOperators v=n.getOtherOperators();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof varOperatorMain3) {
			varOperatorMain3 n = (varOperatorMain3)node;
			printToken("(");
			{
				var v=n.getVar();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof constructorOperator) {
			constructorOperator n = (constructorOperator)node;
			{
				ModuleNaamPrefix v=n.getModuleNaamPrefix();
				if (v!=null) {
					v.accept(this);
				}
			}
			{
				constructorOperatorMain v=n.getConstructorOperatorMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof constructorOperatorMain1) {
			constructorOperatorMain1 n = (constructorOperatorMain1)node;
			{
				ASTStringNode v=n.getConsym();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof constructorOperatorMain2) {
			constructorOperatorMain2 n = (constructorOperatorMain2)node;
			{
				otherOperators v=n.getOtherOperators();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof constructorOperatorMain3) {
			constructorOperatorMain3 n = (constructorOperatorMain3)node;
			printToken(":");
			return false;
		}
		if (node instanceof constructorOperatorMain4) {
			constructorOperatorMain4 n = (constructorOperatorMain4)node;
			printToken("(");
			{
				naam v=n.getNaam();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(")");
			return false;
		}
		if (node instanceof ModuleNaamPrefix) {
			ModuleNaamPrefix n = (ModuleNaamPrefix)node;
			{
				naamMain v=n.getNaamMain();
				if (v!=null) {
					v.accept(this);
				}
			}
			printToken(".");
			for (naamMain v : n.getNaamMain1()) {
				v.accept(this);
				printToken(".");
			}
			return false;
		}
		if (node instanceof otherOperators1) {
			otherOperators1 n = (otherOperators1)node;
			printToken("+");
			return false;
		}
		if (node instanceof otherOperators2) {
			otherOperators2 n = (otherOperators2)node;
			printToken(".");
			return false;
		}
		if (node instanceof otherOperators3) {
			otherOperators3 n = (otherOperators3)node;
			printToken("-");
			return false;
		}
		if (node instanceof otherOperators4) {
			otherOperators4 n = (otherOperators4)node;
			printToken("_");
			return false;
		}
		if (node instanceof literal1) {
			literal1 n = (literal1)node;
			{
				ASTStringNode v=n.getInteger();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof literal2) {
			literal2 n = (literal2)node;
			{
				ASTStringNode v=n.getFloat_kw();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof literal3) {
			literal3 n = (literal3)node;
			{
				ASTStringNode v=n.getCharacter_literal();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		if (node instanceof literal4) {
			literal4 n = (literal4)node;
			{
				ASTStringNode v=n.getString_literal();
				if (v!=null) {
					v.accept(this);
				}
			}
			return false;
		}
		return true;
	}
}
