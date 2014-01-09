package org.eclipselabs.spray.shapes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.spray.shapes.services.ShapeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShapeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connection'", "'{'", "'connection-type'", "'}'", "'shape'", "'placing'", "'position'", "'('", "'offset'", "'='", "','", "'radius'", "'angle'", "')'", "'anchor'", "'xoffset'", "'yoffset'", "'x'", "'y'", "'line'", "'polyline'", "'rectangle'", "'rounded-rectangle'", "'polygon'", "'ellipse'", "'compartment'", "'layout'", "'stretching'", "'horizontal'", "'vertical'", "'spacing'", "'margin'", "'invisible'", "'description'", "'align'", "'size-min'", "'width'", "'height'", "'size-max'", "'proportional'", "'curve'", "'style'", "'size'", "'id'", "'point'", "'curveBefore'", "'curveAfter'", "'true'", "'false'", "'-'", "'.'", "'fixed'", "'fit'", "'left'", "'center'", "'right'", "'top'", "'middle'", "'bottom'", "'freeform'", "'manhatten'", "'corners'", "'text'", "'wrapped-text'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalShapeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShapeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShapeParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g"; }



     	private ShapeGrammarAccess grammarAccess;
     	
        public InternalShapeParser(TokenStream input, ShapeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ShapeContainer";	
       	}
       	
       	@Override
       	protected ShapeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleShapeContainer"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:68:1: entryRuleShapeContainer returns [EObject current=null] : iv_ruleShapeContainer= ruleShapeContainer EOF ;
    public final EObject entryRuleShapeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeContainer = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:69:2: (iv_ruleShapeContainer= ruleShapeContainer EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:70:2: iv_ruleShapeContainer= ruleShapeContainer EOF
            {
             newCompositeNode(grammarAccess.getShapeContainerRule()); 
            pushFollow(FOLLOW_ruleShapeContainer_in_entryRuleShapeContainer75);
            iv_ruleShapeContainer=ruleShapeContainer();

            state._fsp--;

             current =iv_ruleShapeContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeContainer85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeContainer"


    // $ANTLR start "ruleShapeContainer"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:77:1: ruleShapeContainer returns [EObject current=null] : ( (lv_shapeContainerElement_0_0= ruleShapeContainerElement ) )* ;
    public final EObject ruleShapeContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeContainerElement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:80:28: ( ( (lv_shapeContainerElement_0_0= ruleShapeContainerElement ) )* )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:81:1: ( (lv_shapeContainerElement_0_0= ruleShapeContainerElement ) )*
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:81:1: ( (lv_shapeContainerElement_0_0= ruleShapeContainerElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:82:1: (lv_shapeContainerElement_0_0= ruleShapeContainerElement )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:82:1: (lv_shapeContainerElement_0_0= ruleShapeContainerElement )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:83:3: lv_shapeContainerElement_0_0= ruleShapeContainerElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShapeContainerAccess().getShapeContainerElementShapeContainerElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShapeContainerElement_in_ruleShapeContainer130);
            	    lv_shapeContainerElement_0_0=ruleShapeContainerElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShapeContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shapeContainerElement",
            	            		lv_shapeContainerElement_0_0, 
            	            		"ShapeContainerElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeContainer"


    // $ANTLR start "entryRuleShapeContainerElement"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:107:1: entryRuleShapeContainerElement returns [EObject current=null] : iv_ruleShapeContainerElement= ruleShapeContainerElement EOF ;
    public final EObject entryRuleShapeContainerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeContainerElement = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:108:2: (iv_ruleShapeContainerElement= ruleShapeContainerElement EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:109:2: iv_ruleShapeContainerElement= ruleShapeContainerElement EOF
            {
             newCompositeNode(grammarAccess.getShapeContainerElementRule()); 
            pushFollow(FOLLOW_ruleShapeContainerElement_in_entryRuleShapeContainerElement166);
            iv_ruleShapeContainerElement=ruleShapeContainerElement();

            state._fsp--;

             current =iv_ruleShapeContainerElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeContainerElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeContainerElement"


    // $ANTLR start "ruleShapeContainerElement"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:116:1: ruleShapeContainerElement returns [EObject current=null] : (this_ShapeDefinition_0= ruleShapeDefinition | this_ConnectionDefinition_1= ruleConnectionDefinition ) ;
    public final EObject ruleShapeContainerElement() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeDefinition_0 = null;

        EObject this_ConnectionDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:119:28: ( (this_ShapeDefinition_0= ruleShapeDefinition | this_ConnectionDefinition_1= ruleConnectionDefinition ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:120:1: (this_ShapeDefinition_0= ruleShapeDefinition | this_ConnectionDefinition_1= ruleConnectionDefinition )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:120:1: (this_ShapeDefinition_0= ruleShapeDefinition | this_ConnectionDefinition_1= ruleConnectionDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:121:5: this_ShapeDefinition_0= ruleShapeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getShapeContainerElementAccess().getShapeDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShapeDefinition_in_ruleShapeContainerElement223);
                    this_ShapeDefinition_0=ruleShapeDefinition();

                    state._fsp--;

                     
                            current = this_ShapeDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:131:5: this_ConnectionDefinition_1= ruleConnectionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getShapeContainerElementAccess().getConnectionDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConnectionDefinition_in_ruleShapeContainerElement250);
                    this_ConnectionDefinition_1=ruleConnectionDefinition();

                    state._fsp--;

                     
                            current = this_ConnectionDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeContainerElement"


    // $ANTLR start "entryRuleConnectionDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:147:1: entryRuleConnectionDefinition returns [EObject current=null] : iv_ruleConnectionDefinition= ruleConnectionDefinition EOF ;
    public final EObject entryRuleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDefinition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:148:2: (iv_ruleConnectionDefinition= ruleConnectionDefinition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:149:2: iv_ruleConnectionDefinition= ruleConnectionDefinition EOF
            {
             newCompositeNode(grammarAccess.getConnectionDefinitionRule()); 
            pushFollow(FOLLOW_ruleConnectionDefinition_in_entryRuleConnectionDefinition285);
            iv_ruleConnectionDefinition=ruleConnectionDefinition();

            state._fsp--;

             current =iv_ruleConnectionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDefinition295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionDefinition"


    // $ANTLR start "ruleConnectionDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:156:1: ruleConnectionDefinition returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )? ( (lv_layout_6_0= ruleShapestyleLayout ) )? ( (lv_placing_7_0= rulePlacingDefinition ) )* otherlv_8= '}' ) ;
    public final EObject ruleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        Enumerator lv_connectionStyle_5_0 = null;

        EObject lv_layout_6_0 = null;

        EObject lv_placing_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:159:28: ( (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )? ( (lv_layout_6_0= ruleShapestyleLayout ) )? ( (lv_placing_7_0= rulePlacingDefinition ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:160:1: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )? ( (lv_layout_6_0= ruleShapestyleLayout ) )? ( (lv_placing_7_0= rulePlacingDefinition ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:160:1: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )? ( (lv_layout_6_0= ruleShapestyleLayout ) )? ( (lv_placing_7_0= rulePlacingDefinition ) )* otherlv_8= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:160:3: otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )? ( (lv_layout_6_0= ruleShapestyleLayout ) )? ( (lv_placing_7_0= rulePlacingDefinition ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConnectionDefinition332); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionDefinitionAccess().getConnectionKeyword_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:165:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectionDefinition349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectionDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:182:2: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:183:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:183:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:184:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleConnectionDefinition375);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConnectionDefinition388); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectionDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:204:1: (otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:204:3: otherlv_4= 'connection-type' ( (lv_connectionStyle_5_0= ruleConnectionStyle ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConnectionDefinition401); 

                        	newLeafNode(otherlv_4, grammarAccess.getConnectionDefinitionAccess().getConnectionTypeKeyword_4_0());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:208:1: ( (lv_connectionStyle_5_0= ruleConnectionStyle ) )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:209:1: (lv_connectionStyle_5_0= ruleConnectionStyle )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:209:1: (lv_connectionStyle_5_0= ruleConnectionStyle )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:210:3: lv_connectionStyle_5_0= ruleConnectionStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getConnectionStyleConnectionStyleEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConnectionStyle_in_ruleConnectionDefinition422);
                    lv_connectionStyle_5_0=ruleConnectionStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"connectionStyle",
                            		lv_connectionStyle_5_0, 
                            		"ConnectionStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:226:4: ( (lv_layout_6_0= ruleShapestyleLayout ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:227:1: (lv_layout_6_0= ruleShapestyleLayout )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:227:1: (lv_layout_6_0= ruleShapestyleLayout )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:228:3: lv_layout_6_0= ruleShapestyleLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getLayoutShapestyleLayoutParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapestyleLayout_in_ruleConnectionDefinition445);
                    lv_layout_6_0=ruleShapestyleLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_6_0, 
                            		"ShapestyleLayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:244:3: ( (lv_placing_7_0= rulePlacingDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:245:1: (lv_placing_7_0= rulePlacingDefinition )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:245:1: (lv_placing_7_0= rulePlacingDefinition )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:246:3: lv_placing_7_0= rulePlacingDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getPlacingPlacingDefinitionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlacingDefinition_in_ruleConnectionDefinition467);
            	    lv_placing_7_0=rulePlacingDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"placing",
            	            		lv_placing_7_0, 
            	            		"PlacingDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleConnectionDefinition480); 

                	newLeafNode(otherlv_8, grammarAccess.getConnectionDefinitionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionDefinition"


    // $ANTLR start "entryRuleShapeDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:274:1: entryRuleShapeDefinition returns [EObject current=null] : iv_ruleShapeDefinition= ruleShapeDefinition EOF ;
    public final EObject entryRuleShapeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDefinition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:275:2: (iv_ruleShapeDefinition= ruleShapeDefinition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:276:2: iv_ruleShapeDefinition= ruleShapeDefinition EOF
            {
             newCompositeNode(grammarAccess.getShapeDefinitionRule()); 
            pushFollow(FOLLOW_ruleShapeDefinition_in_entryRuleShapeDefinition516);
            iv_ruleShapeDefinition=ruleShapeDefinition();

            state._fsp--;

             current =iv_ruleShapeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeDefinition526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeDefinition"


    // $ANTLR start "ruleShapeDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:283:1: ruleShapeDefinition returns [EObject current=null] : (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' ( (lv_shapeLayout_4_0= ruleShapeLayout ) ) ( (lv_shape_5_0= ruleShape ) )+ ( (lv_description_6_0= ruleDescription ) )? ( (lv_anchor_7_0= ruleAnchor ) )? otherlv_8= '}' ) ;
    public final EObject ruleShapeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_shapeLayout_4_0 = null;

        EObject lv_shape_5_0 = null;

        EObject lv_description_6_0 = null;

        EObject lv_anchor_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:286:28: ( (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' ( (lv_shapeLayout_4_0= ruleShapeLayout ) ) ( (lv_shape_5_0= ruleShape ) )+ ( (lv_description_6_0= ruleDescription ) )? ( (lv_anchor_7_0= ruleAnchor ) )? otherlv_8= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:287:1: (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' ( (lv_shapeLayout_4_0= ruleShapeLayout ) ) ( (lv_shape_5_0= ruleShape ) )+ ( (lv_description_6_0= ruleDescription ) )? ( (lv_anchor_7_0= ruleAnchor ) )? otherlv_8= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:287:1: (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' ( (lv_shapeLayout_4_0= ruleShapeLayout ) ) ( (lv_shape_5_0= ruleShape ) )+ ( (lv_description_6_0= ruleDescription ) )? ( (lv_anchor_7_0= ruleAnchor ) )? otherlv_8= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:287:3: otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' ( (lv_shapeLayout_4_0= ruleShapeLayout ) ) ( (lv_shape_5_0= ruleShape ) )+ ( (lv_description_6_0= ruleDescription ) )? ( (lv_anchor_7_0= ruleAnchor ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleShapeDefinition563); 

                	newLeafNode(otherlv_0, grammarAccess.getShapeDefinitionAccess().getShapeKeyword_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:291:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:292:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:292:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:293:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShapeDefinition580); 

            			newLeafNode(lv_name_1_0, grammarAccess.getShapeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShapeDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:309:2: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==52) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:310:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:310:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:311:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getShapeDefinitionAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleShapeDefinition606);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShapeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleShapeDefinition619); 

                	newLeafNode(otherlv_3, grammarAccess.getShapeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:331:1: ( (lv_shapeLayout_4_0= ruleShapeLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:332:1: (lv_shapeLayout_4_0= ruleShapeLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:332:1: (lv_shapeLayout_4_0= ruleShapeLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:333:3: lv_shapeLayout_4_0= ruleShapeLayout
            {
             
            	        newCompositeNode(grammarAccess.getShapeDefinitionAccess().getShapeLayoutShapeLayoutParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleShapeLayout_in_ruleShapeDefinition640);
            lv_shapeLayout_4_0=ruleShapeLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShapeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"shapeLayout",
                    		lv_shapeLayout_4_0, 
                    		"ShapeLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:349:2: ( (lv_shape_5_0= ruleShape ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=30 && LA8_0<=35)||(LA8_0>=73 && LA8_0<=74)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:350:1: (lv_shape_5_0= ruleShape )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:350:1: (lv_shape_5_0= ruleShape )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:351:3: lv_shape_5_0= ruleShape
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShapeDefinitionAccess().getShapeShapeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShape_in_ruleShapeDefinition661);
            	    lv_shape_5_0=ruleShape();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShapeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shape",
            	            		lv_shape_5_0, 
            	            		"Shape");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:367:3: ( (lv_description_6_0= ruleDescription ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:368:1: (lv_description_6_0= ruleDescription )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:368:1: (lv_description_6_0= ruleDescription )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:369:3: lv_description_6_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getShapeDefinitionAccess().getDescriptionDescriptionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_ruleShapeDefinition683);
                    lv_description_6_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShapeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:385:3: ( (lv_anchor_7_0= ruleAnchor ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:386:1: (lv_anchor_7_0= ruleAnchor )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:386:1: (lv_anchor_7_0= ruleAnchor )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:387:3: lv_anchor_7_0= ruleAnchor
                    {
                     
                    	        newCompositeNode(grammarAccess.getShapeDefinitionAccess().getAnchorAnchorParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnchor_in_ruleShapeDefinition705);
                    lv_anchor_7_0=ruleAnchor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShapeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"anchor",
                            		lv_anchor_7_0, 
                            		"Anchor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleShapeDefinition718); 

                	newLeafNode(otherlv_8, grammarAccess.getShapeDefinitionAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeDefinition"


    // $ANTLR start "entryRulePlacingDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:415:1: entryRulePlacingDefinition returns [EObject current=null] : iv_rulePlacingDefinition= rulePlacingDefinition EOF ;
    public final EObject entryRulePlacingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacingDefinition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:416:2: (iv_rulePlacingDefinition= rulePlacingDefinition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:417:2: iv_rulePlacingDefinition= rulePlacingDefinition EOF
            {
             newCompositeNode(grammarAccess.getPlacingDefinitionRule()); 
            pushFollow(FOLLOW_rulePlacingDefinition_in_entryRulePlacingDefinition754);
            iv_rulePlacingDefinition=rulePlacingDefinition();

            state._fsp--;

             current =iv_rulePlacingDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlacingDefinition764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlacingDefinition"


    // $ANTLR start "rulePlacingDefinition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:424:1: rulePlacingDefinition returns [EObject current=null] : (otherlv_0= 'placing' otherlv_1= '{' otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'offset' otherlv_5= '=' ( (lv_offset_6_0= ruleDOUBLE ) ) (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )? otherlv_15= ')' ( (lv_shapeCon_16_0= ruleShapeConnection ) ) otherlv_17= '}' ) ;
    public final EObject rulePlacingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_distance_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_angle_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_offset_6_0 = null;

        EObject lv_shapeCon_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:427:28: ( (otherlv_0= 'placing' otherlv_1= '{' otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'offset' otherlv_5= '=' ( (lv_offset_6_0= ruleDOUBLE ) ) (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )? otherlv_15= ')' ( (lv_shapeCon_16_0= ruleShapeConnection ) ) otherlv_17= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:428:1: (otherlv_0= 'placing' otherlv_1= '{' otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'offset' otherlv_5= '=' ( (lv_offset_6_0= ruleDOUBLE ) ) (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )? otherlv_15= ')' ( (lv_shapeCon_16_0= ruleShapeConnection ) ) otherlv_17= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:428:1: (otherlv_0= 'placing' otherlv_1= '{' otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'offset' otherlv_5= '=' ( (lv_offset_6_0= ruleDOUBLE ) ) (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )? otherlv_15= ')' ( (lv_shapeCon_16_0= ruleShapeConnection ) ) otherlv_17= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:428:3: otherlv_0= 'placing' otherlv_1= '{' otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'offset' otherlv_5= '=' ( (lv_offset_6_0= ruleDOUBLE ) ) (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )? otherlv_15= ')' ( (lv_shapeCon_16_0= ruleShapeConnection ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePlacingDefinition801); 

                	newLeafNode(otherlv_0, grammarAccess.getPlacingDefinitionAccess().getPlacingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePlacingDefinition813); 

                	newLeafNode(otherlv_1, grammarAccess.getPlacingDefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePlacingDefinition825); 

                	newLeafNode(otherlv_2, grammarAccess.getPlacingDefinitionAccess().getPositionKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePlacingDefinition837); 

                	newLeafNode(otherlv_3, grammarAccess.getPlacingDefinitionAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePlacingDefinition849); 

                	newLeafNode(otherlv_4, grammarAccess.getPlacingDefinitionAccess().getOffsetKeyword_4());
                
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePlacingDefinition861); 

                	newLeafNode(otherlv_5, grammarAccess.getPlacingDefinitionAccess().getEqualsSignKeyword_5());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:452:1: ( (lv_offset_6_0= ruleDOUBLE ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:453:1: (lv_offset_6_0= ruleDOUBLE )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:453:1: (lv_offset_6_0= ruleDOUBLE )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:454:3: lv_offset_6_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getPlacingDefinitionAccess().getOffsetDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_rulePlacingDefinition882);
            lv_offset_6_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlacingDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"offset",
                    		lv_offset_6_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:470:2: (otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:470:4: otherlv_7= ',' otherlv_8= 'radius' otherlv_9= '=' ( (lv_distance_10_0= RULE_INT ) ) otherlv_11= ',' otherlv_12= 'angle' otherlv_13= '=' ( (lv_angle_14_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_rulePlacingDefinition895); 

                        	newLeafNode(otherlv_7, grammarAccess.getPlacingDefinitionAccess().getCommaKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulePlacingDefinition907); 

                        	newLeafNode(otherlv_8, grammarAccess.getPlacingDefinitionAccess().getRadiusKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulePlacingDefinition919); 

                        	newLeafNode(otherlv_9, grammarAccess.getPlacingDefinitionAccess().getEqualsSignKeyword_7_2());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:482:1: ( (lv_distance_10_0= RULE_INT ) )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:483:1: (lv_distance_10_0= RULE_INT )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:483:1: (lv_distance_10_0= RULE_INT )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:484:3: lv_distance_10_0= RULE_INT
                    {
                    lv_distance_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlacingDefinition936); 

                    			newLeafNode(lv_distance_10_0, grammarAccess.getPlacingDefinitionAccess().getDistanceINTTerminalRuleCall_7_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPlacingDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"distance",
                            		lv_distance_10_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePlacingDefinition953); 

                        	newLeafNode(otherlv_11, grammarAccess.getPlacingDefinitionAccess().getCommaKeyword_7_4());
                        
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_rulePlacingDefinition965); 

                        	newLeafNode(otherlv_12, grammarAccess.getPlacingDefinitionAccess().getAngleKeyword_7_5());
                        
                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_rulePlacingDefinition977); 

                        	newLeafNode(otherlv_13, grammarAccess.getPlacingDefinitionAccess().getEqualsSignKeyword_7_6());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:512:1: ( (lv_angle_14_0= RULE_INT ) )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:513:1: (lv_angle_14_0= RULE_INT )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:513:1: (lv_angle_14_0= RULE_INT )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:514:3: lv_angle_14_0= RULE_INT
                    {
                    lv_angle_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlacingDefinition994); 

                    			newLeafNode(lv_angle_14_0, grammarAccess.getPlacingDefinitionAccess().getAngleINTTerminalRuleCall_7_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPlacingDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_14_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_rulePlacingDefinition1013); 

                	newLeafNode(otherlv_15, grammarAccess.getPlacingDefinitionAccess().getRightParenthesisKeyword_8());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:534:1: ( (lv_shapeCon_16_0= ruleShapeConnection ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:535:1: (lv_shapeCon_16_0= ruleShapeConnection )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:535:1: (lv_shapeCon_16_0= ruleShapeConnection )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:536:3: lv_shapeCon_16_0= ruleShapeConnection
            {
             
            	        newCompositeNode(grammarAccess.getPlacingDefinitionAccess().getShapeConShapeConnectionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleShapeConnection_in_rulePlacingDefinition1034);
            lv_shapeCon_16_0=ruleShapeConnection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlacingDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"shapeCon",
                    		lv_shapeCon_16_0, 
                    		"ShapeConnection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_rulePlacingDefinition1046); 

                	newLeafNode(otherlv_17, grammarAccess.getPlacingDefinitionAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacingDefinition"


    // $ANTLR start "entryRuleAnchor"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:564:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:565:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:566:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor1082);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor1092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:573:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'anchor' ( (lv_type_1_0= ruleAnchorType ) ) ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:576:28: ( (otherlv_0= 'anchor' ( (lv_type_1_0= ruleAnchorType ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:577:1: (otherlv_0= 'anchor' ( (lv_type_1_0= ruleAnchorType ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:577:1: (otherlv_0= 'anchor' ( (lv_type_1_0= ruleAnchorType ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:577:3: otherlv_0= 'anchor' ( (lv_type_1_0= ruleAnchorType ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAnchor1129); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAnchorKeyword_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:581:1: ( (lv_type_1_0= ruleAnchorType ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:582:1: (lv_type_1_0= ruleAnchorType )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:582:1: (lv_type_1_0= ruleAnchorType )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:583:3: lv_type_1_0= ruleAnchorType
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getTypeAnchorTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnchorType_in_ruleAnchor1150);
            lv_type_1_0=ruleAnchorType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AnchorType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleAnchorType"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:607:1: entryRuleAnchorType returns [EObject current=null] : iv_ruleAnchorType= ruleAnchorType EOF ;
    public final EObject entryRuleAnchorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorType = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:608:2: (iv_ruleAnchorType= ruleAnchorType EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:609:2: iv_ruleAnchorType= ruleAnchorType EOF
            {
             newCompositeNode(grammarAccess.getAnchorTypeRule()); 
            pushFollow(FOLLOW_ruleAnchorType_in_entryRuleAnchorType1186);
            iv_ruleAnchorType=ruleAnchorType();

            state._fsp--;

             current =iv_ruleAnchorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorType1196); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorType"


    // $ANTLR start "ruleAnchorType"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:616:1: ruleAnchorType returns [EObject current=null] : (this_AnchorPredefinied_0= ruleAnchorPredefinied | this_AnchorManual_1= ruleAnchorManual ) ;
    public final EObject ruleAnchorType() throws RecognitionException {
        EObject current = null;

        EObject this_AnchorPredefinied_0 = null;

        EObject this_AnchorManual_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:619:28: ( (this_AnchorPredefinied_0= ruleAnchorPredefinied | this_AnchorManual_1= ruleAnchorManual ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:620:1: (this_AnchorPredefinied_0= ruleAnchorPredefinied | this_AnchorManual_1= ruleAnchorManual )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:620:1: (this_AnchorPredefinied_0= ruleAnchorPredefinied | this_AnchorManual_1= ruleAnchorManual )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==65||LA12_0==72) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:621:5: this_AnchorPredefinied_0= ruleAnchorPredefinied
                    {
                     
                            newCompositeNode(grammarAccess.getAnchorTypeAccess().getAnchorPredefiniedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnchorPredefinied_in_ruleAnchorType1243);
                    this_AnchorPredefinied_0=ruleAnchorPredefinied();

                    state._fsp--;

                     
                            current = this_AnchorPredefinied_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:631:5: this_AnchorManual_1= ruleAnchorManual
                    {
                     
                            newCompositeNode(grammarAccess.getAnchorTypeAccess().getAnchorManualParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchorManual_in_ruleAnchorType1270);
                    this_AnchorManual_1=ruleAnchorManual();

                    state._fsp--;

                     
                            current = this_AnchorManual_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorType"


    // $ANTLR start "entryRuleAnchorPredefinied"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:647:1: entryRuleAnchorPredefinied returns [EObject current=null] : iv_ruleAnchorPredefinied= ruleAnchorPredefinied EOF ;
    public final EObject entryRuleAnchorPredefinied() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorPredefinied = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:648:2: (iv_ruleAnchorPredefinied= ruleAnchorPredefinied EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:649:2: iv_ruleAnchorPredefinied= ruleAnchorPredefinied EOF
            {
             newCompositeNode(grammarAccess.getAnchorPredefiniedRule()); 
            pushFollow(FOLLOW_ruleAnchorPredefinied_in_entryRuleAnchorPredefinied1305);
            iv_ruleAnchorPredefinied=ruleAnchorPredefinied();

            state._fsp--;

             current =iv_ruleAnchorPredefinied; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorPredefinied1315); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorPredefinied"


    // $ANTLR start "ruleAnchorPredefinied"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:656:1: ruleAnchorPredefinied returns [EObject current=null] : ( (lv_value_0_0= ruleAnchorPredefiniedEnum ) ) ;
    public final EObject ruleAnchorPredefinied() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:659:28: ( ( (lv_value_0_0= ruleAnchorPredefiniedEnum ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:660:1: ( (lv_value_0_0= ruleAnchorPredefiniedEnum ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:660:1: ( (lv_value_0_0= ruleAnchorPredefiniedEnum ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:661:1: (lv_value_0_0= ruleAnchorPredefiniedEnum )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:661:1: (lv_value_0_0= ruleAnchorPredefiniedEnum )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:662:3: lv_value_0_0= ruleAnchorPredefiniedEnum
            {
             
            	        newCompositeNode(grammarAccess.getAnchorPredefiniedAccess().getValueAnchorPredefiniedEnumEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAnchorPredefiniedEnum_in_ruleAnchorPredefinied1360);
            lv_value_0_0=ruleAnchorPredefiniedEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorPredefiniedRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"AnchorPredefiniedEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorPredefinied"


    // $ANTLR start "entryRuleAnchorManual"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:686:1: entryRuleAnchorManual returns [EObject current=null] : iv_ruleAnchorManual= ruleAnchorManual EOF ;
    public final EObject entryRuleAnchorManual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorManual = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:687:2: (iv_ruleAnchorManual= ruleAnchorManual EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:688:2: iv_ruleAnchorManual= ruleAnchorManual EOF
            {
             newCompositeNode(grammarAccess.getAnchorManualRule()); 
            pushFollow(FOLLOW_ruleAnchorManual_in_entryRuleAnchorManual1395);
            iv_ruleAnchorManual=ruleAnchorManual();

            state._fsp--;

             current =iv_ruleAnchorManual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorManual1405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorManual"


    // $ANTLR start "ruleAnchorManual"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:695:1: ruleAnchorManual returns [EObject current=null] : (otherlv_0= '{' ( (lv_position_1_0= ruleAnchorPosition ) )+ otherlv_2= '}' ) ;
    public final EObject ruleAnchorManual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_position_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:698:28: ( (otherlv_0= '{' ( (lv_position_1_0= ruleAnchorPosition ) )+ otherlv_2= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:699:1: (otherlv_0= '{' ( (lv_position_1_0= ruleAnchorPosition ) )+ otherlv_2= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:699:1: (otherlv_0= '{' ( (lv_position_1_0= ruleAnchorPosition ) )+ otherlv_2= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:699:3: otherlv_0= '{' ( (lv_position_1_0= ruleAnchorPosition ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleAnchorManual1442); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorManualAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:703:1: ( (lv_position_1_0= ruleAnchorPosition ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:704:1: (lv_position_1_0= ruleAnchorPosition )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:704:1: (lv_position_1_0= ruleAnchorPosition )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:705:3: lv_position_1_0= ruleAnchorPosition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnchorManualAccess().getPositionAnchorPositionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnchorPosition_in_ruleAnchorManual1463);
            	    lv_position_1_0=ruleAnchorPosition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnchorManualRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"position",
            	            		lv_position_1_0, 
            	            		"AnchorPosition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAnchorManual1476); 

                	newLeafNode(otherlv_2, grammarAccess.getAnchorManualAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorManual"


    // $ANTLR start "entryRuleAnchorPosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:733:1: entryRuleAnchorPosition returns [EObject current=null] : iv_ruleAnchorPosition= ruleAnchorPosition EOF ;
    public final EObject entryRuleAnchorPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorPosition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:734:2: (iv_ruleAnchorPosition= ruleAnchorPosition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:735:2: iv_ruleAnchorPosition= ruleAnchorPosition EOF
            {
             newCompositeNode(grammarAccess.getAnchorPositionRule()); 
            pushFollow(FOLLOW_ruleAnchorPosition_in_entryRuleAnchorPosition1512);
            iv_ruleAnchorPosition=ruleAnchorPosition();

            state._fsp--;

             current =iv_ruleAnchorPosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorPosition1522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorPosition"


    // $ANTLR start "ruleAnchorPosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:742:1: ruleAnchorPosition returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= '(' ( (lv_pos_2_0= ruleAnchorPositionPos ) ) otherlv_3= ')' ) ;
    public final EObject ruleAnchorPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pos_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:745:28: ( (otherlv_0= 'position' otherlv_1= '(' ( (lv_pos_2_0= ruleAnchorPositionPos ) ) otherlv_3= ')' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:746:1: (otherlv_0= 'position' otherlv_1= '(' ( (lv_pos_2_0= ruleAnchorPositionPos ) ) otherlv_3= ')' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:746:1: (otherlv_0= 'position' otherlv_1= '(' ( (lv_pos_2_0= ruleAnchorPositionPos ) ) otherlv_3= ')' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:746:3: otherlv_0= 'position' otherlv_1= '(' ( (lv_pos_2_0= ruleAnchorPositionPos ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAnchorPosition1559); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorPositionAccess().getPositionKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAnchorPosition1571); 

                	newLeafNode(otherlv_1, grammarAccess.getAnchorPositionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:754:1: ( (lv_pos_2_0= ruleAnchorPositionPos ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:755:1: (lv_pos_2_0= ruleAnchorPositionPos )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:755:1: (lv_pos_2_0= ruleAnchorPositionPos )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:756:3: lv_pos_2_0= ruleAnchorPositionPos
            {
             
            	        newCompositeNode(grammarAccess.getAnchorPositionAccess().getPosAnchorPositionPosParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnchorPositionPos_in_ruleAnchorPosition1592);
            lv_pos_2_0=ruleAnchorPositionPos();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorPositionRule());
            	        }
                   		set(
                   			current, 
                   			"pos",
                    		lv_pos_2_0, 
                    		"AnchorPositionPos");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAnchorPosition1604); 

                	newLeafNode(otherlv_3, grammarAccess.getAnchorPositionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorPosition"


    // $ANTLR start "entryRuleAnchorPositionPos"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:784:1: entryRuleAnchorPositionPos returns [EObject current=null] : iv_ruleAnchorPositionPos= ruleAnchorPositionPos EOF ;
    public final EObject entryRuleAnchorPositionPos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorPositionPos = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:785:2: (iv_ruleAnchorPositionPos= ruleAnchorPositionPos EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:786:2: iv_ruleAnchorPositionPos= ruleAnchorPositionPos EOF
            {
             newCompositeNode(grammarAccess.getAnchorPositionPosRule()); 
            pushFollow(FOLLOW_ruleAnchorPositionPos_in_entryRuleAnchorPositionPos1640);
            iv_ruleAnchorPositionPos=ruleAnchorPositionPos();

            state._fsp--;

             current =iv_ruleAnchorPositionPos; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorPositionPos1650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorPositionPos"


    // $ANTLR start "ruleAnchorPositionPos"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:793:1: ruleAnchorPositionPos returns [EObject current=null] : (this_AnchorRelativePosition_0= ruleAnchorRelativePosition | this_AnchorFixPointPosition_1= ruleAnchorFixPointPosition ) ;
    public final EObject ruleAnchorPositionPos() throws RecognitionException {
        EObject current = null;

        EObject this_AnchorRelativePosition_0 = null;

        EObject this_AnchorFixPointPosition_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:796:28: ( (this_AnchorRelativePosition_0= ruleAnchorRelativePosition | this_AnchorFixPointPosition_1= ruleAnchorFixPointPosition ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:797:1: (this_AnchorRelativePosition_0= ruleAnchorRelativePosition | this_AnchorFixPointPosition_1= ruleAnchorFixPointPosition )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:797:1: (this_AnchorRelativePosition_0= ruleAnchorRelativePosition | this_AnchorFixPointPosition_1= ruleAnchorFixPointPosition )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:798:5: this_AnchorRelativePosition_0= ruleAnchorRelativePosition
                    {
                     
                            newCompositeNode(grammarAccess.getAnchorPositionPosAccess().getAnchorRelativePositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnchorRelativePosition_in_ruleAnchorPositionPos1697);
                    this_AnchorRelativePosition_0=ruleAnchorRelativePosition();

                    state._fsp--;

                     
                            current = this_AnchorRelativePosition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:808:5: this_AnchorFixPointPosition_1= ruleAnchorFixPointPosition
                    {
                     
                            newCompositeNode(grammarAccess.getAnchorPositionPosAccess().getAnchorFixPointPositionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchorFixPointPosition_in_ruleAnchorPositionPos1724);
                    this_AnchorFixPointPosition_1=ruleAnchorFixPointPosition();

                    state._fsp--;

                     
                            current = this_AnchorFixPointPosition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorPositionPos"


    // $ANTLR start "entryRuleAnchorRelativePosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:824:1: entryRuleAnchorRelativePosition returns [EObject current=null] : iv_ruleAnchorRelativePosition= ruleAnchorRelativePosition EOF ;
    public final EObject entryRuleAnchorRelativePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorRelativePosition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:825:2: (iv_ruleAnchorRelativePosition= ruleAnchorRelativePosition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:826:2: iv_ruleAnchorRelativePosition= ruleAnchorRelativePosition EOF
            {
             newCompositeNode(grammarAccess.getAnchorRelativePositionRule()); 
            pushFollow(FOLLOW_ruleAnchorRelativePosition_in_entryRuleAnchorRelativePosition1759);
            iv_ruleAnchorRelativePosition=ruleAnchorRelativePosition();

            state._fsp--;

             current =iv_ruleAnchorRelativePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorRelativePosition1769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorRelativePosition"


    // $ANTLR start "ruleAnchorRelativePosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:833:1: ruleAnchorRelativePosition returns [EObject current=null] : (otherlv_0= 'xoffset' otherlv_1= '=' ( (lv_xoffset_2_0= ruleDOUBLE ) ) otherlv_3= ',' otherlv_4= 'yoffset' otherlv_5= '=' ( (lv_yoffset_6_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleAnchorRelativePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_xoffset_2_0 = null;

        AntlrDatatypeRuleToken lv_yoffset_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:836:28: ( (otherlv_0= 'xoffset' otherlv_1= '=' ( (lv_xoffset_2_0= ruleDOUBLE ) ) otherlv_3= ',' otherlv_4= 'yoffset' otherlv_5= '=' ( (lv_yoffset_6_0= ruleDOUBLE ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:837:1: (otherlv_0= 'xoffset' otherlv_1= '=' ( (lv_xoffset_2_0= ruleDOUBLE ) ) otherlv_3= ',' otherlv_4= 'yoffset' otherlv_5= '=' ( (lv_yoffset_6_0= ruleDOUBLE ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:837:1: (otherlv_0= 'xoffset' otherlv_1= '=' ( (lv_xoffset_2_0= ruleDOUBLE ) ) otherlv_3= ',' otherlv_4= 'yoffset' otherlv_5= '=' ( (lv_yoffset_6_0= ruleDOUBLE ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:837:3: otherlv_0= 'xoffset' otherlv_1= '=' ( (lv_xoffset_2_0= ruleDOUBLE ) ) otherlv_3= ',' otherlv_4= 'yoffset' otherlv_5= '=' ( (lv_yoffset_6_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAnchorRelativePosition1806); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorRelativePositionAccess().getXoffsetKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAnchorRelativePosition1818); 

                	newLeafNode(otherlv_1, grammarAccess.getAnchorRelativePositionAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:845:1: ( (lv_xoffset_2_0= ruleDOUBLE ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:846:1: (lv_xoffset_2_0= ruleDOUBLE )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:846:1: (lv_xoffset_2_0= ruleDOUBLE )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:847:3: lv_xoffset_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getAnchorRelativePositionAccess().getXoffsetDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleAnchorRelativePosition1839);
            lv_xoffset_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRelativePositionRule());
            	        }
                   		set(
                   			current, 
                   			"xoffset",
                    		lv_xoffset_2_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAnchorRelativePosition1851); 

                	newLeafNode(otherlv_3, grammarAccess.getAnchorRelativePositionAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleAnchorRelativePosition1863); 

                	newLeafNode(otherlv_4, grammarAccess.getAnchorRelativePositionAccess().getYoffsetKeyword_4());
                
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAnchorRelativePosition1875); 

                	newLeafNode(otherlv_5, grammarAccess.getAnchorRelativePositionAccess().getEqualsSignKeyword_5());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:875:1: ( (lv_yoffset_6_0= ruleDOUBLE ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:876:1: (lv_yoffset_6_0= ruleDOUBLE )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:876:1: (lv_yoffset_6_0= ruleDOUBLE )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:877:3: lv_yoffset_6_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getAnchorRelativePositionAccess().getYoffsetDOUBLEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleAnchorRelativePosition1896);
            lv_yoffset_6_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRelativePositionRule());
            	        }
                   		set(
                   			current, 
                   			"yoffset",
                    		lv_yoffset_6_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorRelativePosition"


    // $ANTLR start "entryRuleAnchorFixPointPosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:901:1: entryRuleAnchorFixPointPosition returns [EObject current=null] : iv_ruleAnchorFixPointPosition= ruleAnchorFixPointPosition EOF ;
    public final EObject entryRuleAnchorFixPointPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchorFixPointPosition = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:902:2: (iv_ruleAnchorFixPointPosition= ruleAnchorFixPointPosition EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:903:2: iv_ruleAnchorFixPointPosition= ruleAnchorFixPointPosition EOF
            {
             newCompositeNode(grammarAccess.getAnchorFixPointPositionRule()); 
            pushFollow(FOLLOW_ruleAnchorFixPointPosition_in_entryRuleAnchorFixPointPosition1932);
            iv_ruleAnchorFixPointPosition=ruleAnchorFixPointPosition();

            state._fsp--;

             current =iv_ruleAnchorFixPointPosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchorFixPointPosition1942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchorFixPointPosition"


    // $ANTLR start "ruleAnchorFixPointPosition"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:910:1: ruleAnchorFixPointPosition returns [EObject current=null] : (otherlv_0= 'x' otherlv_1= '=' ( (lv_xcor_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= 'y' otherlv_5= '=' ( (lv_ycor_6_0= RULE_INT ) ) ) ;
    public final EObject ruleAnchorFixPointPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xcor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ycor_6_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:913:28: ( (otherlv_0= 'x' otherlv_1= '=' ( (lv_xcor_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= 'y' otherlv_5= '=' ( (lv_ycor_6_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:914:1: (otherlv_0= 'x' otherlv_1= '=' ( (lv_xcor_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= 'y' otherlv_5= '=' ( (lv_ycor_6_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:914:1: (otherlv_0= 'x' otherlv_1= '=' ( (lv_xcor_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= 'y' otherlv_5= '=' ( (lv_ycor_6_0= RULE_INT ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:914:3: otherlv_0= 'x' otherlv_1= '=' ( (lv_xcor_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= 'y' otherlv_5= '=' ( (lv_ycor_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAnchorFixPointPosition1979); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorFixPointPositionAccess().getXKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAnchorFixPointPosition1991); 

                	newLeafNode(otherlv_1, grammarAccess.getAnchorFixPointPositionAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:922:1: ( (lv_xcor_2_0= RULE_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:923:1: (lv_xcor_2_0= RULE_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:923:1: (lv_xcor_2_0= RULE_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:924:3: lv_xcor_2_0= RULE_INT
            {
            lv_xcor_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAnchorFixPointPosition2008); 

            			newLeafNode(lv_xcor_2_0, grammarAccess.getAnchorFixPointPositionAccess().getXcorINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorFixPointPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"xcor",
                    		lv_xcor_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAnchorFixPointPosition2025); 

                	newLeafNode(otherlv_3, grammarAccess.getAnchorFixPointPositionAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAnchorFixPointPosition2037); 

                	newLeafNode(otherlv_4, grammarAccess.getAnchorFixPointPositionAccess().getYKeyword_4());
                
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAnchorFixPointPosition2049); 

                	newLeafNode(otherlv_5, grammarAccess.getAnchorFixPointPositionAccess().getEqualsSignKeyword_5());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:952:1: ( (lv_ycor_6_0= RULE_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:953:1: (lv_ycor_6_0= RULE_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:953:1: (lv_ycor_6_0= RULE_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:954:3: lv_ycor_6_0= RULE_INT
            {
            lv_ycor_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAnchorFixPointPosition2066); 

            			newLeafNode(lv_ycor_6_0, grammarAccess.getAnchorFixPointPositionAccess().getYcorINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorFixPointPositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ycor",
                    		lv_ycor_6_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorFixPointPosition"


    // $ANTLR start "entryRuleShape"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:978:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:979:2: (iv_ruleShape= ruleShape EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:980:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_ruleShape_in_entryRuleShape2107);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShape2117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:987:1: ruleShape returns [EObject current=null] : (this_Line_0= ruleLine | this_Polyline_1= rulePolyline | this_Rectangle_2= ruleRectangle | this_RoundedRectangle_3= ruleRoundedRectangle | this_Polygon_4= rulePolygon | this_Ellipse_5= ruleEllipse | this_Text_6= ruleText ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject this_Line_0 = null;

        EObject this_Polyline_1 = null;

        EObject this_Rectangle_2 = null;

        EObject this_RoundedRectangle_3 = null;

        EObject this_Polygon_4 = null;

        EObject this_Ellipse_5 = null;

        EObject this_Text_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:990:28: ( (this_Line_0= ruleLine | this_Polyline_1= rulePolyline | this_Rectangle_2= ruleRectangle | this_RoundedRectangle_3= ruleRoundedRectangle | this_Polygon_4= rulePolygon | this_Ellipse_5= ruleEllipse | this_Text_6= ruleText ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:991:1: (this_Line_0= ruleLine | this_Polyline_1= rulePolyline | this_Rectangle_2= ruleRectangle | this_RoundedRectangle_3= ruleRoundedRectangle | this_Polygon_4= rulePolygon | this_Ellipse_5= ruleEllipse | this_Text_6= ruleText )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:991:1: (this_Line_0= ruleLine | this_Polyline_1= rulePolyline | this_Rectangle_2= ruleRectangle | this_RoundedRectangle_3= ruleRoundedRectangle | this_Polygon_4= rulePolygon | this_Ellipse_5= ruleEllipse | this_Text_6= ruleText )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case 33:
                {
                alt15=4;
                }
                break;
            case 34:
                {
                alt15=5;
                }
                break;
            case 35:
                {
                alt15=6;
                }
                break;
            case 73:
            case 74:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:992:5: this_Line_0= ruleLine
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getLineParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLine_in_ruleShape2164);
                    this_Line_0=ruleLine();

                    state._fsp--;

                     
                            current = this_Line_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1002:5: this_Polyline_1= rulePolyline
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getPolylineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePolyline_in_ruleShape2191);
                    this_Polyline_1=rulePolyline();

                    state._fsp--;

                     
                            current = this_Polyline_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1012:5: this_Rectangle_2= ruleRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getRectangleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRectangle_in_ruleShape2218);
                    this_Rectangle_2=ruleRectangle();

                    state._fsp--;

                     
                            current = this_Rectangle_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1022:5: this_RoundedRectangle_3= ruleRoundedRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getRoundedRectangleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRoundedRectangle_in_ruleShape2245);
                    this_RoundedRectangle_3=ruleRoundedRectangle();

                    state._fsp--;

                     
                            current = this_RoundedRectangle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1032:5: this_Polygon_4= rulePolygon
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getPolygonParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePolygon_in_ruleShape2272);
                    this_Polygon_4=rulePolygon();

                    state._fsp--;

                     
                            current = this_Polygon_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1042:5: this_Ellipse_5= ruleEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getEllipseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEllipse_in_ruleShape2299);
                    this_Ellipse_5=ruleEllipse();

                    state._fsp--;

                     
                            current = this_Ellipse_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1052:5: this_Text_6= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getTextParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleShape2326);
                    this_Text_6=ruleText();

                    state._fsp--;

                     
                            current = this_Text_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleShapeConnection"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1068:1: entryRuleShapeConnection returns [EObject current=null] : iv_ruleShapeConnection= ruleShapeConnection EOF ;
    public final EObject entryRuleShapeConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConnection = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1069:2: (iv_ruleShapeConnection= ruleShapeConnection EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1070:2: iv_ruleShapeConnection= ruleShapeConnection EOF
            {
             newCompositeNode(grammarAccess.getShapeConnectionRule()); 
            pushFollow(FOLLOW_ruleShapeConnection_in_entryRuleShapeConnection2361);
            iv_ruleShapeConnection=ruleShapeConnection();

            state._fsp--;

             current =iv_ruleShapeConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeConnection2371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeConnection"


    // $ANTLR start "ruleShapeConnection"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1077:1: ruleShapeConnection returns [EObject current=null] : (this_CDLine_0= ruleCDLine | this_CDPolyline_1= ruleCDPolyline | this_CDRectangle_2= ruleCDRectangle | this_CDRoundedRectangle_3= ruleCDRoundedRectangle | this_CDPolygon_4= ruleCDPolygon | this_CDEllipse_5= ruleCDEllipse | this_CDText_6= ruleCDText ) ;
    public final EObject ruleShapeConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CDLine_0 = null;

        EObject this_CDPolyline_1 = null;

        EObject this_CDRectangle_2 = null;

        EObject this_CDRoundedRectangle_3 = null;

        EObject this_CDPolygon_4 = null;

        EObject this_CDEllipse_5 = null;

        EObject this_CDText_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1080:28: ( (this_CDLine_0= ruleCDLine | this_CDPolyline_1= ruleCDPolyline | this_CDRectangle_2= ruleCDRectangle | this_CDRoundedRectangle_3= ruleCDRoundedRectangle | this_CDPolygon_4= ruleCDPolygon | this_CDEllipse_5= ruleCDEllipse | this_CDText_6= ruleCDText ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1081:1: (this_CDLine_0= ruleCDLine | this_CDPolyline_1= ruleCDPolyline | this_CDRectangle_2= ruleCDRectangle | this_CDRoundedRectangle_3= ruleCDRoundedRectangle | this_CDPolygon_4= ruleCDPolygon | this_CDEllipse_5= ruleCDEllipse | this_CDText_6= ruleCDText )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1081:1: (this_CDLine_0= ruleCDLine | this_CDPolyline_1= ruleCDPolyline | this_CDRectangle_2= ruleCDRectangle | this_CDRoundedRectangle_3= ruleCDRoundedRectangle | this_CDPolygon_4= ruleCDPolygon | this_CDEllipse_5= ruleCDEllipse | this_CDText_6= ruleCDText )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            case 34:
                {
                alt16=5;
                }
                break;
            case 35:
                {
                alt16=6;
                }
                break;
            case 73:
            case 74:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1082:5: this_CDLine_0= ruleCDLine
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDLineParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCDLine_in_ruleShapeConnection2418);
                    this_CDLine_0=ruleCDLine();

                    state._fsp--;

                     
                            current = this_CDLine_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1092:5: this_CDPolyline_1= ruleCDPolyline
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDPolylineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCDPolyline_in_ruleShapeConnection2445);
                    this_CDPolyline_1=ruleCDPolyline();

                    state._fsp--;

                     
                            current = this_CDPolyline_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1102:5: this_CDRectangle_2= ruleCDRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDRectangleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCDRectangle_in_ruleShapeConnection2472);
                    this_CDRectangle_2=ruleCDRectangle();

                    state._fsp--;

                     
                            current = this_CDRectangle_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1112:5: this_CDRoundedRectangle_3= ruleCDRoundedRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDRoundedRectangleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCDRoundedRectangle_in_ruleShapeConnection2499);
                    this_CDRoundedRectangle_3=ruleCDRoundedRectangle();

                    state._fsp--;

                     
                            current = this_CDRoundedRectangle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1122:5: this_CDPolygon_4= ruleCDPolygon
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDPolygonParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCDPolygon_in_ruleShapeConnection2526);
                    this_CDPolygon_4=ruleCDPolygon();

                    state._fsp--;

                     
                            current = this_CDPolygon_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1132:5: this_CDEllipse_5= ruleCDEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDEllipseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCDEllipse_in_ruleShapeConnection2553);
                    this_CDEllipse_5=ruleCDEllipse();

                    state._fsp--;

                     
                            current = this_CDEllipse_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1142:5: this_CDText_6= ruleCDText
                    {
                     
                            newCompositeNode(grammarAccess.getShapeConnectionAccess().getCDTextParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCDText_in_ruleShapeConnection2580);
                    this_CDText_6=ruleCDText();

                    state._fsp--;

                     
                            current = this_CDText_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeConnection"


    // $ANTLR start "entryRuleCDLine"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1158:1: entryRuleCDLine returns [EObject current=null] : iv_ruleCDLine= ruleCDLine EOF ;
    public final EObject entryRuleCDLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDLine = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1159:2: (iv_ruleCDLine= ruleCDLine EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1160:2: iv_ruleCDLine= ruleCDLine EOF
            {
             newCompositeNode(grammarAccess.getCDLineRule()); 
            pushFollow(FOLLOW_ruleCDLine_in_entryRuleCDLine2615);
            iv_ruleCDLine=ruleCDLine();

            state._fsp--;

             current =iv_ruleCDLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDLine2625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDLine"


    // $ANTLR start "ruleCDLine"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1167:1: ruleCDLine returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1170:28: ( ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1171:1: ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1171:1: ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1171:2: () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1171:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDLineAccess().getCDLineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCDLine2671); 

                	newLeafNode(otherlv_1, grammarAccess.getCDLineAccess().getLineKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1181:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1182:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1182:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1183:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDLineAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDLine2692);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDLineRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1199:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1199:5: otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDLine2706); 

                	newLeafNode(otherlv_3, grammarAccess.getCDLineAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1203:1: ( (lv_layout_4_0= ruleLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1204:1: (lv_layout_4_0= ruleLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1204:1: (lv_layout_4_0= ruleLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1205:3: lv_layout_4_0= ruleLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDLineAccess().getLayoutLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLineLayout_in_ruleCDLine2727);
            lv_layout_4_0=ruleLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDLineRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"LineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDLine2739); 

                	newLeafNode(otherlv_5, grammarAccess.getCDLineAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDLine"


    // $ANTLR start "entryRuleCDPolyline"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1233:1: entryRuleCDPolyline returns [EObject current=null] : iv_ruleCDPolyline= ruleCDPolyline EOF ;
    public final EObject entryRuleCDPolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDPolyline = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1234:2: (iv_ruleCDPolyline= ruleCDPolyline EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1235:2: iv_ruleCDPolyline= ruleCDPolyline EOF
            {
             newCompositeNode(grammarAccess.getCDPolylineRule()); 
            pushFollow(FOLLOW_ruleCDPolyline_in_entryRuleCDPolyline2776);
            iv_ruleCDPolyline=ruleCDPolyline();

            state._fsp--;

             current =iv_ruleCDPolyline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDPolyline2786); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDPolyline"


    // $ANTLR start "ruleCDPolyline"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1242:1: ruleCDPolyline returns [EObject current=null] : ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDPolyline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1245:28: ( ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1246:1: ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1246:1: ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1246:2: () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1246:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDPolylineAccess().getCDPolylineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCDPolyline2832); 

                	newLeafNode(otherlv_1, grammarAccess.getCDPolylineAccess().getPolylineKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1256:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1257:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1257:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1258:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDPolylineAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDPolyline2853);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDPolylineRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1274:3: (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1274:5: otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDPolyline2867); 

                	newLeafNode(otherlv_3, grammarAccess.getCDPolylineAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1278:1: ( (lv_layout_4_0= rulePolyLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1279:1: (lv_layout_4_0= rulePolyLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1279:1: (lv_layout_4_0= rulePolyLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1280:3: lv_layout_4_0= rulePolyLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDPolylineAccess().getLayoutPolyLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_rulePolyLineLayout_in_ruleCDPolyline2888);
            lv_layout_4_0=rulePolyLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDPolylineRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"PolyLineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDPolyline2900); 

                	newLeafNode(otherlv_5, grammarAccess.getCDPolylineAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDPolyline"


    // $ANTLR start "entryRuleCDRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1308:1: entryRuleCDRectangle returns [EObject current=null] : iv_ruleCDRectangle= ruleCDRectangle EOF ;
    public final EObject entryRuleCDRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDRectangle = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1309:2: (iv_ruleCDRectangle= ruleCDRectangle EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1310:2: iv_ruleCDRectangle= ruleCDRectangle EOF
            {
             newCompositeNode(grammarAccess.getCDRectangleRule()); 
            pushFollow(FOLLOW_ruleCDRectangle_in_entryRuleCDRectangle2937);
            iv_ruleCDRectangle=ruleCDRectangle();

            state._fsp--;

             current =iv_ruleCDRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDRectangle2947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDRectangle"


    // $ANTLR start "ruleCDRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1317:1: ruleCDRectangle returns [EObject current=null] : ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1320:28: ( ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1321:1: ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1321:1: ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1321:2: () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1321:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1322:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDRectangleAccess().getCDRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleCDRectangle2993); 

                	newLeafNode(otherlv_1, grammarAccess.getCDRectangleAccess().getRectangleKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1331:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1332:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1332:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1333:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDRectangleAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDRectangle3014);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDRectangleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1349:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1349:5: otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDRectangle3028); 

                	newLeafNode(otherlv_3, grammarAccess.getCDRectangleAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1353:1: ( (lv_layout_4_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1354:1: (lv_layout_4_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1354:1: (lv_layout_4_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1355:3: lv_layout_4_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDRectangleAccess().getLayoutRectangleEllipseLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleCDRectangle3049);
            lv_layout_4_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDRectangle3061); 

                	newLeafNode(otherlv_5, grammarAccess.getCDRectangleAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDRectangle"


    // $ANTLR start "entryRuleCDRoundedRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1383:1: entryRuleCDRoundedRectangle returns [EObject current=null] : iv_ruleCDRoundedRectangle= ruleCDRoundedRectangle EOF ;
    public final EObject entryRuleCDRoundedRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDRoundedRectangle = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1384:2: (iv_ruleCDRoundedRectangle= ruleCDRoundedRectangle EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1385:2: iv_ruleCDRoundedRectangle= ruleCDRoundedRectangle EOF
            {
             newCompositeNode(grammarAccess.getCDRoundedRectangleRule()); 
            pushFollow(FOLLOW_ruleCDRoundedRectangle_in_entryRuleCDRoundedRectangle3098);
            iv_ruleCDRoundedRectangle=ruleCDRoundedRectangle();

            state._fsp--;

             current =iv_ruleCDRoundedRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDRoundedRectangle3108); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDRoundedRectangle"


    // $ANTLR start "ruleCDRoundedRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1392:1: ruleCDRoundedRectangle returns [EObject current=null] : ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDRoundedRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1395:28: ( ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1396:1: ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1396:1: ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1396:2: () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1396:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1397:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDRoundedRectangleAccess().getCDRoundedRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCDRoundedRectangle3154); 

                	newLeafNode(otherlv_1, grammarAccess.getCDRoundedRectangleAccess().getRoundedRectangleKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1406:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1407:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1407:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1408:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDRoundedRectangleAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDRoundedRectangle3175);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDRoundedRectangleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1424:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1424:5: otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDRoundedRectangle3189); 

                	newLeafNode(otherlv_3, grammarAccess.getCDRoundedRectangleAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1428:1: ( (lv_layout_4_0= ruleRoundedRectangleLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1429:1: (lv_layout_4_0= ruleRoundedRectangleLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1429:1: (lv_layout_4_0= ruleRoundedRectangleLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1430:3: lv_layout_4_0= ruleRoundedRectangleLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDRoundedRectangleAccess().getLayoutRoundedRectangleLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRoundedRectangleLayout_in_ruleCDRoundedRectangle3210);
            lv_layout_4_0=ruleRoundedRectangleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDRoundedRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"RoundedRectangleLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDRoundedRectangle3222); 

                	newLeafNode(otherlv_5, grammarAccess.getCDRoundedRectangleAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDRoundedRectangle"


    // $ANTLR start "entryRuleCDPolygon"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1458:1: entryRuleCDPolygon returns [EObject current=null] : iv_ruleCDPolygon= ruleCDPolygon EOF ;
    public final EObject entryRuleCDPolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDPolygon = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1459:2: (iv_ruleCDPolygon= ruleCDPolygon EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1460:2: iv_ruleCDPolygon= ruleCDPolygon EOF
            {
             newCompositeNode(grammarAccess.getCDPolygonRule()); 
            pushFollow(FOLLOW_ruleCDPolygon_in_entryRuleCDPolygon3259);
            iv_ruleCDPolygon=ruleCDPolygon();

            state._fsp--;

             current =iv_ruleCDPolygon; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDPolygon3269); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDPolygon"


    // $ANTLR start "ruleCDPolygon"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1467:1: ruleCDPolygon returns [EObject current=null] : ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDPolygon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1470:28: ( ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1471:1: ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1471:1: ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1471:2: () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1471:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1472:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDPolygonAccess().getCDPolygonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleCDPolygon3315); 

                	newLeafNode(otherlv_1, grammarAccess.getCDPolygonAccess().getPolygonKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1481:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1482:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1482:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1483:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDPolygonAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDPolygon3336);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDPolygonRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1499:3: (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1499:5: otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDPolygon3350); 

                	newLeafNode(otherlv_3, grammarAccess.getCDPolygonAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1503:1: ( (lv_layout_4_0= rulePolyLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1504:1: (lv_layout_4_0= rulePolyLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1504:1: (lv_layout_4_0= rulePolyLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1505:3: lv_layout_4_0= rulePolyLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDPolygonAccess().getLayoutPolyLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_rulePolyLineLayout_in_ruleCDPolygon3371);
            lv_layout_4_0=rulePolyLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDPolygonRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"PolyLineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDPolygon3383); 

                	newLeafNode(otherlv_5, grammarAccess.getCDPolygonAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDPolygon"


    // $ANTLR start "entryRuleCDEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1533:1: entryRuleCDEllipse returns [EObject current=null] : iv_ruleCDEllipse= ruleCDEllipse EOF ;
    public final EObject entryRuleCDEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDEllipse = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1534:2: (iv_ruleCDEllipse= ruleCDEllipse EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1535:2: iv_ruleCDEllipse= ruleCDEllipse EOF
            {
             newCompositeNode(grammarAccess.getCDEllipseRule()); 
            pushFollow(FOLLOW_ruleCDEllipse_in_entryRuleCDEllipse3420);
            iv_ruleCDEllipse=ruleCDEllipse();

            state._fsp--;

             current =iv_ruleCDEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDEllipse3430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDEllipse"


    // $ANTLR start "ruleCDEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1542:1: ruleCDEllipse returns [EObject current=null] : ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCDEllipse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1545:28: ( ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1546:1: ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1546:1: ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1546:2: () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1546:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDEllipseAccess().getCDEllipseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleCDEllipse3476); 

                	newLeafNode(otherlv_1, grammarAccess.getCDEllipseAccess().getEllipseKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1556:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1557:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1557:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1558:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDEllipseAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDEllipse3497);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDEllipseRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1574:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1574:5: otherlv_3= '{' ( (lv_layout_4_0= ruleRectangleEllipseLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDEllipse3511); 

                	newLeafNode(otherlv_3, grammarAccess.getCDEllipseAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1578:1: ( (lv_layout_4_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1579:1: (lv_layout_4_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1579:1: (lv_layout_4_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1580:3: lv_layout_4_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDEllipseAccess().getLayoutRectangleEllipseLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleCDEllipse3532);
            lv_layout_4_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDEllipseRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCDEllipse3544); 

                	newLeafNode(otherlv_5, grammarAccess.getCDEllipseAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDEllipse"


    // $ANTLR start "entryRuleCDText"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1608:1: entryRuleCDText returns [EObject current=null] : iv_ruleCDText= ruleCDText EOF ;
    public final EObject entryRuleCDText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDText = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1609:2: (iv_ruleCDText= ruleCDText EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1610:2: iv_ruleCDText= ruleCDText EOF
            {
             newCompositeNode(grammarAccess.getCDTextRule()); 
            pushFollow(FOLLOW_ruleCDText_in_entryRuleCDText3581);
            iv_ruleCDText=ruleCDText();

            state._fsp--;

             current =iv_ruleCDText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCDText3591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDText"


    // $ANTLR start "ruleCDText"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1617:1: ruleCDText returns [EObject current=null] : ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleCDText() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_texttype_1_0 = null;

        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1620:28: ( ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1621:1: ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1621:1: ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1621:2: () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1621:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1622:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCDTextAccess().getCDTextAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1627:2: ( (lv_texttype_1_0= ruleTextType ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1628:1: (lv_texttype_1_0= ruleTextType )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1628:1: (lv_texttype_1_0= ruleTextType )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1629:3: lv_texttype_1_0= ruleTextType
            {
             
            	        newCompositeNode(grammarAccess.getCDTextAccess().getTexttypeTextTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextType_in_ruleCDText3646);
            lv_texttype_1_0=ruleTextType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDTextRule());
            	        }
                   		set(
                   			current, 
                   			"texttype",
                    		lv_texttype_1_0, 
                    		"TextType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1645:2: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==52) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1646:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1646:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1647:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getCDTextAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleCDText3667);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCDTextRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1663:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1663:5: otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCDText3681); 

                	newLeafNode(otherlv_3, grammarAccess.getCDTextAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1667:1: ( (lv_layout_4_0= ruleTextLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1668:1: (lv_layout_4_0= ruleTextLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1668:1: (lv_layout_4_0= ruleTextLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1669:3: lv_layout_4_0= ruleTextLayout
            {
             
            	        newCompositeNode(grammarAccess.getCDTextAccess().getLayoutTextLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextLayout_in_ruleCDText3702);
            lv_layout_4_0=ruleTextLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDTextRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"TextLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1685:2: ( (lv_body_5_0= ruleTextBody ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1686:1: (lv_body_5_0= ruleTextBody )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1686:1: (lv_body_5_0= ruleTextBody )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1687:3: lv_body_5_0= ruleTextBody
            {
             
            	        newCompositeNode(grammarAccess.getCDTextAccess().getBodyTextBodyParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextBody_in_ruleCDText3723);
            lv_body_5_0=ruleTextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCDTextRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_5_0, 
                    		"TextBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCDText3735); 

                	newLeafNode(otherlv_6, grammarAccess.getCDTextAccess().getRightCurlyBracketKeyword_3_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDText"


    // $ANTLR start "entryRuleLine"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1715:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1716:2: (iv_ruleLine= ruleLine EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1717:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine3772);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine3782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1724:1: ruleLine returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1727:28: ( ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1728:1: ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1728:1: ( () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1728:2: () otherlv_1= 'line' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1728:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1729:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineAccess().getLineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLine3828); 

                	newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLineKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1738:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1739:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1739:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1740:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleLine3849);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1756:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1756:5: otherlv_3= '{' ( (lv_layout_4_0= ruleLineLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleLine3863); 

                	newLeafNode(otherlv_3, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1760:1: ( (lv_layout_4_0= ruleLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1761:1: (lv_layout_4_0= ruleLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1761:1: (lv_layout_4_0= ruleLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1762:3: lv_layout_4_0= ruleLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getLineAccess().getLayoutLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLineLayout_in_ruleLine3884);
            lv_layout_4_0=ruleLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"LineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleLine3896); 

                	newLeafNode(otherlv_5, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRulePolyline"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1790:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1791:2: (iv_rulePolyline= rulePolyline EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1792:2: iv_rulePolyline= rulePolyline EOF
            {
             newCompositeNode(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_rulePolyline_in_entryRulePolyline3933);
            iv_rulePolyline=rulePolyline();

            state._fsp--;

             current =iv_rulePolyline; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolyline3943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyline"


    // $ANTLR start "rulePolyline"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1799:1: rulePolyline returns [EObject current=null] : ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1802:28: ( ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1803:1: ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1803:1: ( () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1803:2: () otherlv_1= 'polyline' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1803:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1804:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolylineAccess().getPolylineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePolyline3989); 

                	newLeafNode(otherlv_1, grammarAccess.getPolylineAccess().getPolylineKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1813:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1814:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1814:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1815:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolylineAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_rulePolyline4010);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPolylineRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1831:3: (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1831:5: otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePolyline4024); 

                	newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1835:1: ( (lv_layout_4_0= rulePolyLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1836:1: (lv_layout_4_0= rulePolyLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1836:1: (lv_layout_4_0= rulePolyLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1837:3: lv_layout_4_0= rulePolyLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getPolylineAccess().getLayoutPolyLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_rulePolyLineLayout_in_rulePolyline4045);
            lv_layout_4_0=rulePolyLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolylineRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"PolyLineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePolyline4057); 

                	newLeafNode(otherlv_5, grammarAccess.getPolylineAccess().getRightCurlyBracketKeyword_3_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyline"


    // $ANTLR start "entryRuleRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1865:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1866:2: (iv_ruleRectangle= ruleRectangle EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1867:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_ruleRectangle_in_entryRuleRectangle4094);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangle4104); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1874:1: ruleRectangle returns [EObject current=null] : ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_compartmentInfo_4_0 = null;

        EObject lv_layout_5_0 = null;

        EObject lv_shape_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1877:28: ( ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1878:1: ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1878:1: ( () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1878:2: () otherlv_1= 'rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1878:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRectangleAccess().getRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleRectangle4150); 

                	newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getRectangleKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1888:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1889:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1889:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1890:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getRectangleAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleRectangle4171);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1906:3: (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1906:5: otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRectangle4185); 

                	newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1910:1: ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1911:1: (lv_compartmentInfo_4_0= ruleCompartmentInfo )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1911:1: (lv_compartmentInfo_4_0= ruleCompartmentInfo )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1912:3: lv_compartmentInfo_4_0= ruleCompartmentInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getRectangleAccess().getCompartmentInfoCompartmentInfoParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompartmentInfo_in_ruleRectangle4206);
                    lv_compartmentInfo_4_0=ruleCompartmentInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
                    	        }
                           		set(
                           			current, 
                           			"compartmentInfo",
                            		lv_compartmentInfo_4_0, 
                            		"CompartmentInfo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1928:3: ( (lv_layout_5_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1929:1: (lv_layout_5_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1929:1: (lv_layout_5_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1930:3: lv_layout_5_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getRectangleAccess().getLayoutRectangleEllipseLayoutParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleRectangle4228);
            lv_layout_5_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_5_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1946:2: ( (lv_shape_6_0= ruleShape ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=30 && LA28_0<=35)||(LA28_0>=73 && LA28_0<=74)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1947:1: (lv_shape_6_0= ruleShape )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1947:1: (lv_shape_6_0= ruleShape )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1948:3: lv_shape_6_0= ruleShape
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleAccess().getShapeShapeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShape_in_ruleRectangle4249);
            	    lv_shape_6_0=ruleShape();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shape",
            	            		lv_shape_6_0, 
            	            		"Shape");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRectangle4262); 

                	newLeafNode(otherlv_7, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_3_4());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleRoundedRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1976:1: entryRuleRoundedRectangle returns [EObject current=null] : iv_ruleRoundedRectangle= ruleRoundedRectangle EOF ;
    public final EObject entryRuleRoundedRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundedRectangle = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1977:2: (iv_ruleRoundedRectangle= ruleRoundedRectangle EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1978:2: iv_ruleRoundedRectangle= ruleRoundedRectangle EOF
            {
             newCompositeNode(grammarAccess.getRoundedRectangleRule()); 
            pushFollow(FOLLOW_ruleRoundedRectangle_in_entryRuleRoundedRectangle4299);
            iv_ruleRoundedRectangle=ruleRoundedRectangle();

            state._fsp--;

             current =iv_ruleRoundedRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoundedRectangle4309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundedRectangle"


    // $ANTLR start "ruleRoundedRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1985:1: ruleRoundedRectangle returns [EObject current=null] : ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) ) ;
    public final EObject ruleRoundedRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_shape_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1988:28: ( ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1989:1: ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1989:1: ( () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1989:2: () otherlv_1= 'rounded-rectangle' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1989:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1990:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoundedRectangleAccess().getRoundedRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleRoundedRectangle4355); 

                	newLeafNode(otherlv_1, grammarAccess.getRoundedRectangleAccess().getRoundedRectangleKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1999:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2000:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2000:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2001:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoundedRectangleAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleRoundedRectangle4376);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoundedRectangleRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2017:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2017:5: otherlv_3= '{' ( (lv_layout_4_0= ruleRoundedRectangleLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRoundedRectangle4390); 

                	newLeafNode(otherlv_3, grammarAccess.getRoundedRectangleAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2021:1: ( (lv_layout_4_0= ruleRoundedRectangleLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2022:1: (lv_layout_4_0= ruleRoundedRectangleLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2022:1: (lv_layout_4_0= ruleRoundedRectangleLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2023:3: lv_layout_4_0= ruleRoundedRectangleLayout
            {
             
            	        newCompositeNode(grammarAccess.getRoundedRectangleAccess().getLayoutRoundedRectangleLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRoundedRectangleLayout_in_ruleRoundedRectangle4411);
            lv_layout_4_0=ruleRoundedRectangleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoundedRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"RoundedRectangleLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2039:2: ( (lv_shape_5_0= ruleShape ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=30 && LA30_0<=35)||(LA30_0>=73 && LA30_0<=74)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2040:1: (lv_shape_5_0= ruleShape )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2040:1: (lv_shape_5_0= ruleShape )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2041:3: lv_shape_5_0= ruleShape
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoundedRectangleAccess().getShapeShapeParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShape_in_ruleRoundedRectangle4432);
            	    lv_shape_5_0=ruleShape();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoundedRectangleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shape",
            	            		lv_shape_5_0, 
            	            		"Shape");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleRoundedRectangle4445); 

                	newLeafNode(otherlv_6, grammarAccess.getRoundedRectangleAccess().getRightCurlyBracketKeyword_3_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundedRectangle"


    // $ANTLR start "entryRulePolygon"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2069:1: entryRulePolygon returns [EObject current=null] : iv_rulePolygon= rulePolygon EOF ;
    public final EObject entryRulePolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygon = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2070:2: (iv_rulePolygon= rulePolygon EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2071:2: iv_rulePolygon= rulePolygon EOF
            {
             newCompositeNode(grammarAccess.getPolygonRule()); 
            pushFollow(FOLLOW_rulePolygon_in_entryRulePolygon4482);
            iv_rulePolygon=rulePolygon();

            state._fsp--;

             current =iv_rulePolygon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolygon4492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolygon"


    // $ANTLR start "rulePolygon"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2078:1: rulePolygon returns [EObject current=null] : ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) ) ;
    public final EObject rulePolygon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_shape_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2081:28: ( ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2082:1: ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2082:1: ( () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2082:2: () otherlv_1= 'polygon' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2082:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2083:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolygonAccess().getPolygonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePolygon4538); 

                	newLeafNode(otherlv_1, grammarAccess.getPolygonAccess().getPolygonKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2092:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2093:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2093:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2094:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolygonAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_rulePolygon4559);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPolygonRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2110:3: (otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2110:5: otherlv_3= '{' ( (lv_layout_4_0= rulePolyLineLayout ) ) ( (lv_shape_5_0= ruleShape ) )* otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePolygon4573); 

                	newLeafNode(otherlv_3, grammarAccess.getPolygonAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2114:1: ( (lv_layout_4_0= rulePolyLineLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2115:1: (lv_layout_4_0= rulePolyLineLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2115:1: (lv_layout_4_0= rulePolyLineLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2116:3: lv_layout_4_0= rulePolyLineLayout
            {
             
            	        newCompositeNode(grammarAccess.getPolygonAccess().getLayoutPolyLineLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_rulePolyLineLayout_in_rulePolygon4594);
            lv_layout_4_0=rulePolyLineLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolygonRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"PolyLineLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2132:2: ( (lv_shape_5_0= ruleShape ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=30 && LA32_0<=35)||(LA32_0>=73 && LA32_0<=74)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2133:1: (lv_shape_5_0= ruleShape )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2133:1: (lv_shape_5_0= ruleShape )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2134:3: lv_shape_5_0= ruleShape
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolygonAccess().getShapeShapeParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShape_in_rulePolygon4615);
            	    lv_shape_5_0=ruleShape();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolygonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shape",
            	            		lv_shape_5_0, 
            	            		"Shape");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePolygon4628); 

                	newLeafNode(otherlv_6, grammarAccess.getPolygonAccess().getRightCurlyBracketKeyword_3_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolygon"


    // $ANTLR start "entryRuleEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2162:1: entryRuleEllipse returns [EObject current=null] : iv_ruleEllipse= ruleEllipse EOF ;
    public final EObject entryRuleEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEllipse = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2163:2: (iv_ruleEllipse= ruleEllipse EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2164:2: iv_ruleEllipse= ruleEllipse EOF
            {
             newCompositeNode(grammarAccess.getEllipseRule()); 
            pushFollow(FOLLOW_ruleEllipse_in_entryRuleEllipse4665);
            iv_ruleEllipse=ruleEllipse();

            state._fsp--;

             current =iv_ruleEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEllipse4675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEllipse"


    // $ANTLR start "ruleEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2171:1: ruleEllipse returns [EObject current=null] : ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleEllipse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_compartmentInfo_4_0 = null;

        EObject lv_layout_5_0 = null;

        EObject lv_shape_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2174:28: ( ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2175:1: ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2175:1: ( () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2175:2: () otherlv_1= 'ellipse' ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2175:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEllipseAccess().getEllipseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleEllipse4721); 

                	newLeafNode(otherlv_1, grammarAccess.getEllipseAccess().getEllipseKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2185:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2186:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2186:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2187:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getEllipseAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleEllipse4742);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2203:3: (otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2203:5: otherlv_3= '{' ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )? ( (lv_layout_5_0= ruleRectangleEllipseLayout ) ) ( (lv_shape_6_0= ruleShape ) )* otherlv_7= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEllipse4756); 

                	newLeafNode(otherlv_3, grammarAccess.getEllipseAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2207:1: ( (lv_compartmentInfo_4_0= ruleCompartmentInfo ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2208:1: (lv_compartmentInfo_4_0= ruleCompartmentInfo )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2208:1: (lv_compartmentInfo_4_0= ruleCompartmentInfo )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2209:3: lv_compartmentInfo_4_0= ruleCompartmentInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getEllipseAccess().getCompartmentInfoCompartmentInfoParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompartmentInfo_in_ruleEllipse4777);
                    lv_compartmentInfo_4_0=ruleCompartmentInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
                    	        }
                           		set(
                           			current, 
                           			"compartmentInfo",
                            		lv_compartmentInfo_4_0, 
                            		"CompartmentInfo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2225:3: ( (lv_layout_5_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2226:1: (lv_layout_5_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2226:1: (lv_layout_5_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2227:3: lv_layout_5_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getEllipseAccess().getLayoutRectangleEllipseLayoutParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleEllipse4799);
            lv_layout_5_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_5_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2243:2: ( (lv_shape_6_0= ruleShape ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=30 && LA35_0<=35)||(LA35_0>=73 && LA35_0<=74)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2244:1: (lv_shape_6_0= ruleShape )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2244:1: (lv_shape_6_0= ruleShape )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2245:3: lv_shape_6_0= ruleShape
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEllipseAccess().getShapeShapeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShape_in_ruleEllipse4820);
            	    lv_shape_6_0=ruleShape();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEllipseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shape",
            	            		lv_shape_6_0, 
            	            		"Shape");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEllipse4833); 

                	newLeafNode(otherlv_7, grammarAccess.getEllipseAccess().getRightCurlyBracketKeyword_3_4());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEllipse"


    // $ANTLR start "entryRuleText"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2273:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2274:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2275:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4870);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2282:1: ruleText returns [EObject current=null] : ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_texttype_1_0 = null;

        AntlrDatatypeRuleToken lv_style_2_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2285:28: ( ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2286:1: ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2286:1: ( () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2286:2: () ( (lv_texttype_1_0= ruleTextType ) ) ( (lv_style_2_0= ruleShapeStyleRef ) )? (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2286:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2292:2: ( (lv_texttype_1_0= ruleTextType ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2293:1: (lv_texttype_1_0= ruleTextType )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2293:1: (lv_texttype_1_0= ruleTextType )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2294:3: lv_texttype_1_0= ruleTextType
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getTexttypeTextTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextType_in_ruleText4935);
            lv_texttype_1_0=ruleTextType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"texttype",
                    		lv_texttype_1_0, 
                    		"TextType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2310:2: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2311:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2311:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2312:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getStyleShapeStyleRefParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleText4956);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2328:3: (otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2328:5: otherlv_3= '{' ( (lv_layout_4_0= ruleTextLayout ) ) ( (lv_body_5_0= ruleTextBody ) ) otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleText4970); 

                	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2332:1: ( (lv_layout_4_0= ruleTextLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2333:1: (lv_layout_4_0= ruleTextLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2333:1: (lv_layout_4_0= ruleTextLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2334:3: lv_layout_4_0= ruleTextLayout
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getLayoutTextLayoutParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextLayout_in_ruleText4991);
            lv_layout_4_0=ruleTextLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"TextLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2350:2: ( (lv_body_5_0= ruleTextBody ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2351:1: (lv_body_5_0= ruleTextBody )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2351:1: (lv_body_5_0= ruleTextBody )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2352:3: lv_body_5_0= ruleTextBody
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getBodyTextBodyParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextBody_in_ruleText5012);
            lv_body_5_0=ruleTextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_5_0, 
                    		"TextBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleText5024); 

                	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_3_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCompartmentInfo"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2380:1: entryRuleCompartmentInfo returns [EObject current=null] : iv_ruleCompartmentInfo= ruleCompartmentInfo EOF ;
    public final EObject entryRuleCompartmentInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentInfo = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2381:2: (iv_ruleCompartmentInfo= ruleCompartmentInfo EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2382:2: iv_ruleCompartmentInfo= ruleCompartmentInfo EOF
            {
             newCompositeNode(grammarAccess.getCompartmentInfoRule()); 
            pushFollow(FOLLOW_ruleCompartmentInfo_in_entryRuleCompartmentInfo5061);
            iv_ruleCompartmentInfo=ruleCompartmentInfo();

            state._fsp--;

             current =iv_ruleCompartmentInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentInfo5071); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartmentInfo"


    // $ANTLR start "ruleCompartmentInfo"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2389:1: ruleCompartmentInfo returns [EObject current=null] : (otherlv_0= 'compartment' otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) ) otherlv_24= ')' ) ;
    public final EObject ruleCompartmentInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_spacing_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_margin_21_0=null;
        Token lv_invisible_22_0=null;
        Token otherlv_24=null;
        Enumerator lv_compartmentLayout_5_0 = null;

        AntlrDatatypeRuleToken lv_stretchH_10_0 = null;

        AntlrDatatypeRuleToken lv_stretchV_14_0 = null;

        EObject lv_id_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2392:28: ( (otherlv_0= 'compartment' otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) ) otherlv_24= ')' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2393:1: (otherlv_0= 'compartment' otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) ) otherlv_24= ')' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2393:1: (otherlv_0= 'compartment' otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) ) otherlv_24= ')' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2393:3: otherlv_0= 'compartment' otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) ) otherlv_24= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCompartmentInfo5108); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentInfoAccess().getCompartmentKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCompartmentInfo5120); 

                	newLeafNode(otherlv_1, grammarAccess.getCompartmentInfoAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2401:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2403:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2403:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2404:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2407:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?)
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2408:3: ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2408:3: ( ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=7;
                int LA37_0 = input.LA(1);

                if ( LA37_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt37=5;
                }
                else if ( LA37_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt37=6;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2410:4: ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2410:4: ({...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2411:5: {...}? => ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2411:112: ( ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2412:6: ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2415:6: ({...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2415:7: {...}? => (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2415:16: (otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2415:18: otherlv_3= 'layout' otherlv_4= '=' ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleCompartmentInfo5178); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCompartmentInfoAccess().getLayoutKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleCompartmentInfo5190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentInfoAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2423:1: ( (lv_compartmentLayout_5_0= ruleCompartmentLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2424:1: (lv_compartmentLayout_5_0= ruleCompartmentLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2424:1: (lv_compartmentLayout_5_0= ruleCompartmentLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2425:3: lv_compartmentLayout_5_0= ruleCompartmentLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentInfoAccess().getCompartmentLayoutCompartmentLayoutEnumRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompartmentLayout_in_ruleCompartmentInfo5211);
            	    lv_compartmentLayout_5_0=ruleCompartmentLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"compartmentLayout",
            	            		lv_compartmentLayout_5_0, 
            	            		"CompartmentLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2448:4: ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2448:4: ({...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2449:5: {...}? => ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2449:112: ( ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2450:6: ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2453:6: ({...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2453:7: {...}? => (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2453:16: (otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2453:18: otherlv_6= 'stretching' otherlv_7= '(' otherlv_8= 'horizontal' otherlv_9= '=' ( (lv_stretchH_10_0= ruleBoolean ) ) otherlv_11= ',' otherlv_12= 'vertical' otherlv_13= '=' ( (lv_stretchV_14_0= ruleBoolean ) ) otherlv_15= ')'
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleCompartmentInfo5279); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCompartmentInfoAccess().getStretchingKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleCompartmentInfo5291); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentInfoAccess().getLeftParenthesisKeyword_2_1_1());
            	        
            	    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleCompartmentInfo5303); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentInfoAccess().getHorizontalKeyword_2_1_2());
            	        
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCompartmentInfo5315); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentInfoAccess().getEqualsSignKeyword_2_1_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2469:1: ( (lv_stretchH_10_0= ruleBoolean ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2470:1: (lv_stretchH_10_0= ruleBoolean )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2470:1: (lv_stretchH_10_0= ruleBoolean )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2471:3: lv_stretchH_10_0= ruleBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentInfoAccess().getStretchHBooleanParserRuleCall_2_1_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoolean_in_ruleCompartmentInfo5336);
            	    lv_stretchH_10_0=ruleBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"stretchH",
            	            		lv_stretchH_10_0, 
            	            		"Boolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleCompartmentInfo5348); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentInfoAccess().getCommaKeyword_2_1_5());
            	        
            	    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleCompartmentInfo5360); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentInfoAccess().getVerticalKeyword_2_1_6());
            	        
            	    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleCompartmentInfo5372); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentInfoAccess().getEqualsSignKeyword_2_1_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2499:1: ( (lv_stretchV_14_0= ruleBoolean ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2500:1: (lv_stretchV_14_0= ruleBoolean )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2500:1: (lv_stretchV_14_0= ruleBoolean )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2501:3: lv_stretchV_14_0= ruleBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentInfoAccess().getStretchVBooleanParserRuleCall_2_1_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoolean_in_ruleCompartmentInfo5393);
            	    lv_stretchV_14_0=ruleBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"stretchV",
            	            		lv_stretchV_14_0, 
            	            		"Boolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleCompartmentInfo5405); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentInfoAccess().getRightParenthesisKeyword_2_1_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2528:4: ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2528:4: ({...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2529:5: {...}? => ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2529:112: ( ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2530:6: ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2533:6: ({...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2533:7: {...}? => (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2533:16: (otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2533:18: otherlv_16= 'spacing' otherlv_17= '=' ( (lv_spacing_18_0= RULE_INT ) )
            	    {
            	    otherlv_16=(Token)match(input,41,FOLLOW_41_in_ruleCompartmentInfo5473); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentInfoAccess().getSpacingKeyword_2_2_0());
            	        
            	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleCompartmentInfo5485); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentInfoAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2541:1: ( (lv_spacing_18_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2542:1: (lv_spacing_18_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2542:1: (lv_spacing_18_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2543:3: lv_spacing_18_0= RULE_INT
            	    {
            	    lv_spacing_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompartmentInfo5502); 

            	    			newLeafNode(lv_spacing_18_0, grammarAccess.getCompartmentInfoAccess().getSpacingINTTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"spacing",
            	            		lv_spacing_18_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2566:4: ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2566:4: ({...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2567:5: {...}? => ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2567:112: ( ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2568:6: ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2571:6: ({...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2571:7: {...}? => (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2571:16: (otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2571:18: otherlv_19= 'margin' otherlv_20= '=' ( (lv_margin_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleCompartmentInfo5575); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentInfoAccess().getMarginKeyword_2_3_0());
            	        
            	    otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleCompartmentInfo5587); 

            	        	newLeafNode(otherlv_20, grammarAccess.getCompartmentInfoAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2579:1: ( (lv_margin_21_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2580:1: (lv_margin_21_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2580:1: (lv_margin_21_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2581:3: lv_margin_21_0= RULE_INT
            	    {
            	    lv_margin_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompartmentInfo5604); 

            	    			newLeafNode(lv_margin_21_0, grammarAccess.getCompartmentInfoAccess().getMarginINTTerminalRuleCall_2_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"margin",
            	            		lv_margin_21_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2604:4: ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2604:4: ({...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2605:5: {...}? => ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2605:112: ( ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2606:6: ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2609:6: ({...}? => ( (lv_invisible_22_0= 'invisible' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2609:7: {...}? => ( (lv_invisible_22_0= 'invisible' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2609:16: ( (lv_invisible_22_0= 'invisible' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2610:1: (lv_invisible_22_0= 'invisible' )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2610:1: (lv_invisible_22_0= 'invisible' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2611:3: lv_invisible_22_0= 'invisible'
            	    {
            	    lv_invisible_22_0=(Token)match(input,43,FOLLOW_43_in_ruleCompartmentInfo5682); 

            	            newLeafNode(lv_invisible_22_0, grammarAccess.getCompartmentInfoAccess().getInvisibleInvisibleKeyword_2_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		setWithLastConsumed(current, "invisible", true, "invisible");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2631:4: ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2631:4: ({...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2632:5: {...}? => ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2632:112: ( ({...}? => ( (lv_id_23_0= ruleTextBody ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2633:6: ({...}? => ( (lv_id_23_0= ruleTextBody ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2636:6: ({...}? => ( (lv_id_23_0= ruleTextBody ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2636:7: {...}? => ( (lv_id_23_0= ruleTextBody ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartmentInfo", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2636:16: ( (lv_id_23_0= ruleTextBody ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2637:1: (lv_id_23_0= ruleTextBody )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2637:1: (lv_id_23_0= ruleTextBody )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2638:3: lv_id_23_0= ruleTextBody
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentInfoAccess().getIdTextBodyParserRuleCall_2_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextBody_in_ruleCompartmentInfo5770);
            	    lv_id_23_0=ruleTextBody();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentInfoRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_23_0, 
            	            		"TextBody");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleCompartmentInfo", "getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCompartmentInfoAccess().getUnorderedGroup_2());
            	

            }

            otherlv_24=(Token)match(input,24,FOLLOW_24_in_ruleCompartmentInfo5828); 

                	newLeafNode(otherlv_24, grammarAccess.getCompartmentInfoAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentInfo"


    // $ANTLR start "entryRuleCompartmentShape"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2683:1: entryRuleCompartmentShape returns [EObject current=null] : iv_ruleCompartmentShape= ruleCompartmentShape EOF ;
    public final EObject entryRuleCompartmentShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentShape = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2684:2: (iv_ruleCompartmentShape= ruleCompartmentShape EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2685:2: iv_ruleCompartmentShape= ruleCompartmentShape EOF
            {
             newCompositeNode(grammarAccess.getCompartmentShapeRule()); 
            pushFollow(FOLLOW_ruleCompartmentShape_in_entryRuleCompartmentShape5866);
            iv_ruleCompartmentShape=ruleCompartmentShape();

            state._fsp--;

             current =iv_ruleCompartmentShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentShape5876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartmentShape"


    // $ANTLR start "ruleCompartmentShape"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2692:1: ruleCompartmentShape returns [EObject current=null] : (this_CompartmentEllipse_0= ruleCompartmentEllipse | this_CompartmentRectangle_1= ruleCompartmentRectangle ) ;
    public final EObject ruleCompartmentShape() throws RecognitionException {
        EObject current = null;

        EObject this_CompartmentEllipse_0 = null;

        EObject this_CompartmentRectangle_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2695:28: ( (this_CompartmentEllipse_0= ruleCompartmentEllipse | this_CompartmentRectangle_1= ruleCompartmentRectangle ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2696:1: (this_CompartmentEllipse_0= ruleCompartmentEllipse | this_CompartmentRectangle_1= ruleCompartmentRectangle )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2696:1: (this_CompartmentEllipse_0= ruleCompartmentEllipse | this_CompartmentRectangle_1= ruleCompartmentRectangle )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2697:5: this_CompartmentEllipse_0= ruleCompartmentEllipse
                    {
                     
                            newCompositeNode(grammarAccess.getCompartmentShapeAccess().getCompartmentEllipseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompartmentEllipse_in_ruleCompartmentShape5923);
                    this_CompartmentEllipse_0=ruleCompartmentEllipse();

                    state._fsp--;

                     
                            current = this_CompartmentEllipse_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2707:5: this_CompartmentRectangle_1= ruleCompartmentRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getCompartmentShapeAccess().getCompartmentRectangleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompartmentRectangle_in_ruleCompartmentShape5950);
                    this_CompartmentRectangle_1=ruleCompartmentRectangle();

                    state._fsp--;

                     
                            current = this_CompartmentRectangle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentShape"


    // $ANTLR start "entryRuleCompartmentRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2723:1: entryRuleCompartmentRectangle returns [EObject current=null] : iv_ruleCompartmentRectangle= ruleCompartmentRectangle EOF ;
    public final EObject entryRuleCompartmentRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentRectangle = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2724:2: (iv_ruleCompartmentRectangle= ruleCompartmentRectangle EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2725:2: iv_ruleCompartmentRectangle= ruleCompartmentRectangle EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRectangleRule()); 
            pushFollow(FOLLOW_ruleCompartmentRectangle_in_entryRuleCompartmentRectangle5985);
            iv_ruleCompartmentRectangle=ruleCompartmentRectangle();

            state._fsp--;

             current =iv_ruleCompartmentRectangle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentRectangle5995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartmentRectangle"


    // $ANTLR start "ruleCompartmentRectangle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2732:1: ruleCompartmentRectangle returns [EObject current=null] : ( () otherlv_1= 'rectangle' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCompartmentRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_layout_3_0 = null;

        EObject lv_id_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2735:28: ( ( () otherlv_1= 'rectangle' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2736:1: ( () otherlv_1= 'rectangle' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2736:1: ( () otherlv_1= 'rectangle' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2736:2: () otherlv_1= 'rectangle' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2736:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompartmentRectangleAccess().getCompartmentRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleCompartmentRectangle6041); 

                	newLeafNode(otherlv_1, grammarAccess.getCompartmentRectangleAccess().getRectangleKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2746:1: (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2746:3: otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartmentRectangle6054); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentRectangleAccess().getLeftCurlyBracketKeyword_2_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2750:1: ( (lv_layout_3_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2751:1: (lv_layout_3_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2751:1: (lv_layout_3_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2752:3: lv_layout_3_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getCompartmentRectangleAccess().getLayoutRectangleEllipseLayoutParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleCompartmentRectangle6075);
            lv_layout_3_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompartmentRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_3_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2768:2: ( (lv_id_4_0= ruleTextBody ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2769:1: (lv_id_4_0= ruleTextBody )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2769:1: (lv_id_4_0= ruleTextBody )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2770:3: lv_id_4_0= ruleTextBody
            {
             
            	        newCompositeNode(grammarAccess.getCompartmentRectangleAccess().getIdTextBodyParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextBody_in_ruleCompartmentRectangle6096);
            lv_id_4_0=ruleTextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompartmentRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"TextBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartmentRectangle6108); 

                	newLeafNode(otherlv_5, grammarAccess.getCompartmentRectangleAccess().getRightCurlyBracketKeyword_2_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentRectangle"


    // $ANTLR start "entryRuleCompartmentEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2802:1: entryRuleCompartmentEllipse returns [EObject current=null] : iv_ruleCompartmentEllipse= ruleCompartmentEllipse EOF ;
    public final EObject entryRuleCompartmentEllipse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentEllipse = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2803:2: (iv_ruleCompartmentEllipse= ruleCompartmentEllipse EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2804:2: iv_ruleCompartmentEllipse= ruleCompartmentEllipse EOF
            {
             newCompositeNode(grammarAccess.getCompartmentEllipseRule()); 
            pushFollow(FOLLOW_ruleCompartmentEllipse_in_entryRuleCompartmentEllipse6149);
            iv_ruleCompartmentEllipse=ruleCompartmentEllipse();

            state._fsp--;

             current =iv_ruleCompartmentEllipse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentEllipse6159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartmentEllipse"


    // $ANTLR start "ruleCompartmentEllipse"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2811:1: ruleCompartmentEllipse returns [EObject current=null] : ( () otherlv_1= 'ellipse' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleCompartmentEllipse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_layout_3_0 = null;

        EObject lv_id_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2814:28: ( ( () otherlv_1= 'ellipse' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2815:1: ( () otherlv_1= 'ellipse' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2815:1: ( () otherlv_1= 'ellipse' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2815:2: () otherlv_1= 'ellipse' (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2815:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2816:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompartmentEllipseAccess().getCompartmentEllipseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleCompartmentEllipse6205); 

                	newLeafNode(otherlv_1, grammarAccess.getCompartmentEllipseAccess().getEllipseKeyword_1());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2825:1: (otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2825:3: otherlv_2= '{' ( (lv_layout_3_0= ruleRectangleEllipseLayout ) ) ( (lv_id_4_0= ruleTextBody ) ) otherlv_5= '}'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartmentEllipse6218); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentEllipseAccess().getLeftCurlyBracketKeyword_2_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2829:1: ( (lv_layout_3_0= ruleRectangleEllipseLayout ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2830:1: (lv_layout_3_0= ruleRectangleEllipseLayout )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2830:1: (lv_layout_3_0= ruleRectangleEllipseLayout )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2831:3: lv_layout_3_0= ruleRectangleEllipseLayout
            {
             
            	        newCompositeNode(grammarAccess.getCompartmentEllipseAccess().getLayoutRectangleEllipseLayoutParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_ruleCompartmentEllipse6239);
            lv_layout_3_0=ruleRectangleEllipseLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompartmentEllipseRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_3_0, 
                    		"RectangleEllipseLayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2847:2: ( (lv_id_4_0= ruleTextBody ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2848:1: (lv_id_4_0= ruleTextBody )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2848:1: (lv_id_4_0= ruleTextBody )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2849:3: lv_id_4_0= ruleTextBody
            {
             
            	        newCompositeNode(grammarAccess.getCompartmentEllipseAccess().getIdTextBodyParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextBody_in_ruleCompartmentEllipse6260);
            lv_id_4_0=ruleTextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompartmentEllipseRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"TextBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartmentEllipse6272); 

                	newLeafNode(otherlv_5, grammarAccess.getCompartmentEllipseAccess().getRightCurlyBracketKeyword_2_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentEllipse"


    // $ANTLR start "entryRuleDescription"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2877:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2878:2: (iv_ruleDescription= ruleDescription EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2879:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription6309);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription6319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2886:1: ruleDescription returns [EObject current=null] : ( () (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_style_2_0 = null;

        Enumerator lv_hAlign_8_0 = null;

        Enumerator lv_vAlign_12_0 = null;

        EObject lv_body_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2889:28: ( ( () (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2890:1: ( () (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2890:1: ( () (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2890:2: () (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2890:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2891:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2896:2: (otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2896:4: otherlv_1= 'description' ( (lv_style_2_0= ruleShapeStyleRef ) )? otherlv_3= '{' (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )? ( (lv_body_14_0= ruleTextBody ) ) otherlv_15= '}'
            {
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDescription6366); 

                	newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getDescriptionKeyword_1_0());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2900:1: ( (lv_style_2_0= ruleShapeStyleRef ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2901:1: (lv_style_2_0= ruleShapeStyleRef )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2901:1: (lv_style_2_0= ruleShapeStyleRef )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2902:3: lv_style_2_0= ruleShapeStyleRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionAccess().getStyleShapeStyleRefParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapeStyleRef_in_ruleDescription6387);
                    lv_style_2_0=ruleShapeStyleRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_2_0, 
                            		"ShapeStyleRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDescription6400); 

                	newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1_2());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2922:1: (otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2922:3: otherlv_4= 'align' otherlv_5= '(' (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )? otherlv_13= ')'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleDescription6413); 

                        	newLeafNode(otherlv_4, grammarAccess.getDescriptionAccess().getAlignKeyword_1_3_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDescription6425); 

                        	newLeafNode(otherlv_5, grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_1_3_1());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2930:1: (otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==39) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2930:3: otherlv_6= 'horizontal' otherlv_7= '=' ( (lv_hAlign_8_0= ruleHAlign ) ) otherlv_9= ',' otherlv_10= 'vertical' otherlv_11= '=' ( (lv_vAlign_12_0= ruleVAlign ) )
                            {
                            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleDescription6438); 

                                	newLeafNode(otherlv_6, grammarAccess.getDescriptionAccess().getHorizontalKeyword_1_3_2_0());
                                
                            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleDescription6450); 

                                	newLeafNode(otherlv_7, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1_3_2_1());
                                
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2938:1: ( (lv_hAlign_8_0= ruleHAlign ) )
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2939:1: (lv_hAlign_8_0= ruleHAlign )
                            {
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2939:1: (lv_hAlign_8_0= ruleHAlign )
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2940:3: lv_hAlign_8_0= ruleHAlign
                            {
                             
                            	        newCompositeNode(grammarAccess.getDescriptionAccess().getHAlignHAlignEnumRuleCall_1_3_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleHAlign_in_ruleDescription6471);
                            lv_hAlign_8_0=ruleHAlign();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"hAlign",
                                    		lv_hAlign_8_0, 
                                    		"HAlign");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleDescription6483); 

                                	newLeafNode(otherlv_9, grammarAccess.getDescriptionAccess().getCommaKeyword_1_3_2_3());
                                
                            otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleDescription6495); 

                                	newLeafNode(otherlv_10, grammarAccess.getDescriptionAccess().getVerticalKeyword_1_3_2_4());
                                
                            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDescription6507); 

                                	newLeafNode(otherlv_11, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1_3_2_5());
                                
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2968:1: ( (lv_vAlign_12_0= ruleVAlign ) )
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2969:1: (lv_vAlign_12_0= ruleVAlign )
                            {
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2969:1: (lv_vAlign_12_0= ruleVAlign )
                            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2970:3: lv_vAlign_12_0= ruleVAlign
                            {
                             
                            	        newCompositeNode(grammarAccess.getDescriptionAccess().getVAlignVAlignEnumRuleCall_1_3_2_6_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVAlign_in_ruleDescription6528);
                            lv_vAlign_12_0=ruleVAlign();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"vAlign",
                                    		lv_vAlign_12_0, 
                                    		"VAlign");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleDescription6542); 

                        	newLeafNode(otherlv_13, grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_1_3_3());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2990:3: ( (lv_body_14_0= ruleTextBody ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2991:1: (lv_body_14_0= ruleTextBody )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2991:1: (lv_body_14_0= ruleTextBody )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:2992:3: lv_body_14_0= ruleTextBody
            {
             
            	        newCompositeNode(grammarAccess.getDescriptionAccess().getBodyTextBodyParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextBody_in_ruleDescription6565);
            lv_body_14_0=ruleTextBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_14_0, 
                    		"TextBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleDescription6577); 

                	newLeafNode(otherlv_15, grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_1_5());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleShapeLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3020:1: entryRuleShapeLayout returns [EObject current=null] : iv_ruleShapeLayout= ruleShapeLayout EOF ;
    public final EObject entryRuleShapeLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3021:2: (iv_ruleShapeLayout= ruleShapeLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3022:2: iv_ruleShapeLayout= ruleShapeLayout EOF
            {
             newCompositeNode(grammarAccess.getShapeLayoutRule()); 
            pushFollow(FOLLOW_ruleShapeLayout_in_entryRuleShapeLayout6614);
            iv_ruleShapeLayout=ruleShapeLayout();

            state._fsp--;

             current =iv_ruleShapeLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeLayout6624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeLayout"


    // $ANTLR start "ruleShapeLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3029:1: ruleShapeLayout returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleShapeLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_minwidth_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_minheight_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_maxwidth_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_maxheight_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_stretchH_26_0 = null;

        AntlrDatatypeRuleToken lv_stretchV_30_0 = null;

        AntlrDatatypeRuleToken lv_proportional_34_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3032:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3033:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3033:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3033:2: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3033:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShapeLayoutAccess().getShapeLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3039:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3041:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3041:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3042:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3045:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )* )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3046:3: ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )*
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3046:3: ( ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) ) )*
            loop42:
            do {
                int alt42=5;
                int LA42_0 = input.LA(1);

                if ( LA42_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 2) ) {
                    alt42=3;
                }
                else if ( LA42_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 3) ) {
                    alt42=4;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3048:4: ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3048:4: ({...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3049:5: {...}? => ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3049:108: ( ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3050:6: ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3053:6: ({...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3053:7: {...}? => (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3053:16: (otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3053:18: otherlv_2= 'size-min' otherlv_3= '(' otherlv_4= 'width' otherlv_5= '=' ( (lv_minwidth_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'height' otherlv_9= '=' ( (lv_minheight_10_0= RULE_INT ) ) otherlv_11= ')'
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleShapeLayout6716); 

            	        	newLeafNode(otherlv_2, grammarAccess.getShapeLayoutAccess().getSizeMinKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleShapeLayout6728); 

            	        	newLeafNode(otherlv_3, grammarAccess.getShapeLayoutAccess().getLeftParenthesisKeyword_1_0_1());
            	        
            	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleShapeLayout6740); 

            	        	newLeafNode(otherlv_4, grammarAccess.getShapeLayoutAccess().getWidthKeyword_1_0_2());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout6752); 

            	        	newLeafNode(otherlv_5, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_0_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3069:1: ( (lv_minwidth_6_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3070:1: (lv_minwidth_6_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3070:1: (lv_minwidth_6_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3071:3: lv_minwidth_6_0= RULE_INT
            	    {
            	    lv_minwidth_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapeLayout6769); 

            	    			newLeafNode(lv_minwidth_6_0, grammarAccess.getShapeLayoutAccess().getMinwidthINTTerminalRuleCall_1_0_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"minwidth",
            	            		lv_minwidth_6_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleShapeLayout6786); 

            	        	newLeafNode(otherlv_7, grammarAccess.getShapeLayoutAccess().getCommaKeyword_1_0_5());
            	        
            	    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleShapeLayout6798); 

            	        	newLeafNode(otherlv_8, grammarAccess.getShapeLayoutAccess().getHeightKeyword_1_0_6());
            	        
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout6810); 

            	        	newLeafNode(otherlv_9, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_0_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3099:1: ( (lv_minheight_10_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3100:1: (lv_minheight_10_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3100:1: (lv_minheight_10_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3101:3: lv_minheight_10_0= RULE_INT
            	    {
            	    lv_minheight_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapeLayout6827); 

            	    			newLeafNode(lv_minheight_10_0, grammarAccess.getShapeLayoutAccess().getMinheightINTTerminalRuleCall_1_0_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"minheight",
            	            		lv_minheight_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleShapeLayout6844); 

            	        	newLeafNode(otherlv_11, grammarAccess.getShapeLayoutAccess().getRightParenthesisKeyword_1_0_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3128:4: ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3128:4: ({...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3129:5: {...}? => ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3129:108: ( ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3130:6: ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3133:6: ({...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3133:7: {...}? => (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3133:16: (otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3133:18: otherlv_12= 'size-max' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_maxwidth_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_maxheight_20_0= RULE_INT ) ) otherlv_21= ')'
            	    {
            	    otherlv_12=(Token)match(input,49,FOLLOW_49_in_ruleShapeLayout6912); 

            	        	newLeafNode(otherlv_12, grammarAccess.getShapeLayoutAccess().getSizeMaxKeyword_1_1_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleShapeLayout6924); 

            	        	newLeafNode(otherlv_13, grammarAccess.getShapeLayoutAccess().getLeftParenthesisKeyword_1_1_1());
            	        
            	    otherlv_14=(Token)match(input,47,FOLLOW_47_in_ruleShapeLayout6936); 

            	        	newLeafNode(otherlv_14, grammarAccess.getShapeLayoutAccess().getWidthKeyword_1_1_2());
            	        
            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout6948); 

            	        	newLeafNode(otherlv_15, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_1_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3149:1: ( (lv_maxwidth_16_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3150:1: (lv_maxwidth_16_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3150:1: (lv_maxwidth_16_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3151:3: lv_maxwidth_16_0= RULE_INT
            	    {
            	    lv_maxwidth_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapeLayout6965); 

            	    			newLeafNode(lv_maxwidth_16_0, grammarAccess.getShapeLayoutAccess().getMaxwidthINTTerminalRuleCall_1_1_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"maxwidth",
            	            		lv_maxwidth_16_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleShapeLayout6982); 

            	        	newLeafNode(otherlv_17, grammarAccess.getShapeLayoutAccess().getCommaKeyword_1_1_5());
            	        
            	    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleShapeLayout6994); 

            	        	newLeafNode(otherlv_18, grammarAccess.getShapeLayoutAccess().getHeightKeyword_1_1_6());
            	        
            	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout7006); 

            	        	newLeafNode(otherlv_19, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_1_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3179:1: ( (lv_maxheight_20_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3180:1: (lv_maxheight_20_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3180:1: (lv_maxheight_20_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3181:3: lv_maxheight_20_0= RULE_INT
            	    {
            	    lv_maxheight_20_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapeLayout7023); 

            	    			newLeafNode(lv_maxheight_20_0, grammarAccess.getShapeLayoutAccess().getMaxheightINTTerminalRuleCall_1_1_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"maxheight",
            	            		lv_maxheight_20_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleShapeLayout7040); 

            	        	newLeafNode(otherlv_21, grammarAccess.getShapeLayoutAccess().getRightParenthesisKeyword_1_1_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3208:4: ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3208:4: ({...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3209:5: {...}? => ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3209:108: ( ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3210:6: ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3213:6: ({...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3213:7: {...}? => (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3213:16: (otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3213:18: otherlv_22= 'stretching' otherlv_23= '(' otherlv_24= 'horizontal' otherlv_25= '=' ( (lv_stretchH_26_0= ruleBoolean ) ) otherlv_27= ',' otherlv_28= 'vertical' otherlv_29= '=' ( (lv_stretchV_30_0= ruleBoolean ) ) otherlv_31= ')'
            	    {
            	    otherlv_22=(Token)match(input,38,FOLLOW_38_in_ruleShapeLayout7108); 

            	        	newLeafNode(otherlv_22, grammarAccess.getShapeLayoutAccess().getStretchingKeyword_1_2_0());
            	        
            	    otherlv_23=(Token)match(input,18,FOLLOW_18_in_ruleShapeLayout7120); 

            	        	newLeafNode(otherlv_23, grammarAccess.getShapeLayoutAccess().getLeftParenthesisKeyword_1_2_1());
            	        
            	    otherlv_24=(Token)match(input,39,FOLLOW_39_in_ruleShapeLayout7132); 

            	        	newLeafNode(otherlv_24, grammarAccess.getShapeLayoutAccess().getHorizontalKeyword_1_2_2());
            	        
            	    otherlv_25=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout7144); 

            	        	newLeafNode(otherlv_25, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_2_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3229:1: ( (lv_stretchH_26_0= ruleBoolean ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3230:1: (lv_stretchH_26_0= ruleBoolean )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3230:1: (lv_stretchH_26_0= ruleBoolean )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3231:3: lv_stretchH_26_0= ruleBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShapeLayoutAccess().getStretchHBooleanParserRuleCall_1_2_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoolean_in_ruleShapeLayout7165);
            	    lv_stretchH_26_0=ruleBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"stretchH",
            	            		lv_stretchH_26_0, 
            	            		"Boolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,21,FOLLOW_21_in_ruleShapeLayout7177); 

            	        	newLeafNode(otherlv_27, grammarAccess.getShapeLayoutAccess().getCommaKeyword_1_2_5());
            	        
            	    otherlv_28=(Token)match(input,40,FOLLOW_40_in_ruleShapeLayout7189); 

            	        	newLeafNode(otherlv_28, grammarAccess.getShapeLayoutAccess().getVerticalKeyword_1_2_6());
            	        
            	    otherlv_29=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout7201); 

            	        	newLeafNode(otherlv_29, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_2_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3259:1: ( (lv_stretchV_30_0= ruleBoolean ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3260:1: (lv_stretchV_30_0= ruleBoolean )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3260:1: (lv_stretchV_30_0= ruleBoolean )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3261:3: lv_stretchV_30_0= ruleBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShapeLayoutAccess().getStretchVBooleanParserRuleCall_1_2_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoolean_in_ruleShapeLayout7222);
            	    lv_stretchV_30_0=ruleBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"stretchV",
            	            		lv_stretchV_30_0, 
            	            		"Boolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,24,FOLLOW_24_in_ruleShapeLayout7234); 

            	        	newLeafNode(otherlv_31, grammarAccess.getShapeLayoutAccess().getRightParenthesisKeyword_1_2_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3288:4: ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3288:4: ({...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3289:5: {...}? => ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3289:108: ( ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3290:6: ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3293:6: ({...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3293:7: {...}? => (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShapeLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3293:16: (otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3293:18: otherlv_32= 'proportional' otherlv_33= '=' ( (lv_proportional_34_0= ruleBoolean ) )
            	    {
            	    otherlv_32=(Token)match(input,50,FOLLOW_50_in_ruleShapeLayout7302); 

            	        	newLeafNode(otherlv_32, grammarAccess.getShapeLayoutAccess().getProportionalKeyword_1_3_0());
            	        
            	    otherlv_33=(Token)match(input,20,FOLLOW_20_in_ruleShapeLayout7314); 

            	        	newLeafNode(otherlv_33, grammarAccess.getShapeLayoutAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3301:1: ( (lv_proportional_34_0= ruleBoolean ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3302:1: (lv_proportional_34_0= ruleBoolean )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3302:1: (lv_proportional_34_0= ruleBoolean )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3303:3: lv_proportional_34_0= ruleBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShapeLayoutAccess().getProportionalBooleanParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoolean_in_ruleShapeLayout7335);
            	    lv_proportional_34_0=ruleBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShapeLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"proportional",
            	            		lv_proportional_34_0, 
            	            		"Boolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getShapeLayoutAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeLayout"


    // $ANTLR start "entryRuleRectangleEllipseLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3341:1: entryRuleRectangleEllipseLayout returns [EObject current=null] : iv_ruleRectangleEllipseLayout= ruleRectangleEllipseLayout EOF ;
    public final EObject entryRuleRectangleEllipseLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleEllipseLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3342:2: (iv_ruleRectangleEllipseLayout= ruleRectangleEllipseLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3343:2: iv_ruleRectangleEllipseLayout= ruleRectangleEllipseLayout EOF
            {
             newCompositeNode(grammarAccess.getRectangleEllipseLayoutRule()); 
            pushFollow(FOLLOW_ruleRectangleEllipseLayout_in_entryRuleRectangleEllipseLayout7412);
            iv_ruleRectangleEllipseLayout=ruleRectangleEllipseLayout();

            state._fsp--;

             current =iv_ruleRectangleEllipseLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRectangleEllipseLayout7422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRectangleEllipseLayout"


    // $ANTLR start "ruleRectangleEllipseLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3350:1: ruleRectangleEllipseLayout returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleRectangleEllipseLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_common_2_0 = null;

        EObject lv_layout_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3353:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3354:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3354:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3354:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3354:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRectangleEllipseLayoutAccess().getRectangleEllipseLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3360:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3362:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3362:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3363:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3366:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3367:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3367:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==17||LA43_0==53) && getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 1) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3369:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3369:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3370:5: {...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRectangleEllipseLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3370:119: ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3371:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3374:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3374:7: {...}? => ( (lv_common_2_0= ruleCommonLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRectangleEllipseLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3374:16: ( (lv_common_2_0= ruleCommonLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3375:1: (lv_common_2_0= ruleCommonLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3375:1: (lv_common_2_0= ruleCommonLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3376:3: lv_common_2_0= ruleCommonLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleEllipseLayoutAccess().getCommonCommonLayoutParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommonLayout_in_ruleRectangleEllipseLayout7522);
            	    lv_common_2_0=ruleCommonLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleEllipseLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"common",
            	            		lv_common_2_0, 
            	            		"CommonLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3399:4: ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3399:4: ({...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3400:5: {...}? => ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRectangleEllipseLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3400:119: ( ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3401:6: ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3404:6: ({...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3404:7: {...}? => ( (lv_layout_3_0= ruleShapestyleLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRectangleEllipseLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3404:16: ( (lv_layout_3_0= ruleShapestyleLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3405:1: (lv_layout_3_0= ruleShapestyleLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3405:1: (lv_layout_3_0= ruleShapestyleLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3406:3: lv_layout_3_0= ruleShapestyleLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRectangleEllipseLayoutAccess().getLayoutShapestyleLayoutParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShapestyleLayout_in_ruleRectangleEllipseLayout7597);
            	    lv_layout_3_0=ruleShapestyleLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRectangleEllipseLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"layout",
            	            		lv_layout_3_0, 
            	            		"ShapestyleLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleRectangleEllipseLayout", "getUnorderedGroupHelper().canLeave(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRectangleEllipseLayoutAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRectangleEllipseLayout"


    // $ANTLR start "entryRuleLineLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3445:1: entryRuleLineLayout returns [EObject current=null] : iv_ruleLineLayout= ruleLineLayout EOF ;
    public final EObject entryRuleLineLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3446:2: (iv_ruleLineLayout= ruleLineLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3447:2: iv_ruleLineLayout= ruleLineLayout EOF
            {
             newCompositeNode(grammarAccess.getLineLayoutRule()); 
            pushFollow(FOLLOW_ruleLineLayout_in_entryRuleLineLayout7679);
            iv_ruleLineLayout=ruleLineLayout();

            state._fsp--;

             current =iv_ruleLineLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineLayout7689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineLayout"


    // $ANTLR start "ruleLineLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3454:1: ruleLineLayout returns [EObject current=null] : ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) ) ;
    public final EObject ruleLineLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_point_1_0 = null;

        EObject lv_point_2_0 = null;

        EObject lv_layout_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3457:28: ( ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3458:1: ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3458:1: ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3458:2: () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3458:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3459:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineLayoutAccess().getLineLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3464:2: ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )? )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3464:3: ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) ) ( (lv_layout_3_0= ruleShapestyleLayout ) )?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3464:3: ( (lv_point_1_0= rulePoint ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3465:1: (lv_point_1_0= rulePoint )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3465:1: (lv_point_1_0= rulePoint )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3466:3: lv_point_1_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getLineLayoutAccess().getPointPointParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleLineLayout7745);
            lv_point_1_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineLayoutRule());
            	        }
                   		add(
                   			current, 
                   			"point",
                    		lv_point_1_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3482:2: ( (lv_point_2_0= rulePoint ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3483:1: (lv_point_2_0= rulePoint )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3483:1: (lv_point_2_0= rulePoint )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3484:3: lv_point_2_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getLineLayoutAccess().getPointPointParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleLineLayout7766);
            lv_point_2_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineLayoutRule());
            	        }
                   		add(
                   			current, 
                   			"point",
                    		lv_point_2_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3500:2: ( (lv_layout_3_0= ruleShapestyleLayout ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3501:1: (lv_layout_3_0= ruleShapestyleLayout )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3501:1: (lv_layout_3_0= ruleShapestyleLayout )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3502:3: lv_layout_3_0= ruleShapestyleLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getLineLayoutAccess().getLayoutShapestyleLayoutParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapestyleLayout_in_ruleLineLayout7787);
                    lv_layout_3_0=ruleShapestyleLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLineLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_3_0, 
                            		"ShapestyleLayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineLayout"


    // $ANTLR start "entryRulePolyLineLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3526:1: entryRulePolyLineLayout returns [EObject current=null] : iv_rulePolyLineLayout= rulePolyLineLayout EOF ;
    public final EObject entryRulePolyLineLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyLineLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3527:2: (iv_rulePolyLineLayout= rulePolyLineLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3528:2: iv_rulePolyLineLayout= rulePolyLineLayout EOF
            {
             newCompositeNode(grammarAccess.getPolyLineLayoutRule()); 
            pushFollow(FOLLOW_rulePolyLineLayout_in_entryRulePolyLineLayout7825);
            iv_rulePolyLineLayout=rulePolyLineLayout();

            state._fsp--;

             current =iv_rulePolyLineLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolyLineLayout7835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyLineLayout"


    // $ANTLR start "rulePolyLineLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3535:1: rulePolyLineLayout returns [EObject current=null] : ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) ) ;
    public final EObject rulePolyLineLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_point_1_0 = null;

        EObject lv_point_2_0 = null;

        EObject lv_layout_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3538:28: ( ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3539:1: ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3539:1: ( () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3539:2: () ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3539:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3540:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolyLineLayoutAccess().getPolyLineLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3545:2: ( ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )? )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3545:3: ( (lv_point_1_0= rulePoint ) ) ( (lv_point_2_0= rulePoint ) )+ ( (lv_layout_3_0= ruleShapestyleLayout ) )?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3545:3: ( (lv_point_1_0= rulePoint ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3546:1: (lv_point_1_0= rulePoint )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3546:1: (lv_point_1_0= rulePoint )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3547:3: lv_point_1_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getPolyLineLayoutAccess().getPointPointParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_rulePolyLineLayout7891);
            lv_point_1_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolyLineLayoutRule());
            	        }
                   		add(
                   			current, 
                   			"point",
                    		lv_point_1_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3563:2: ( (lv_point_2_0= rulePoint ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==55) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3564:1: (lv_point_2_0= rulePoint )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3564:1: (lv_point_2_0= rulePoint )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3565:3: lv_point_2_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolyLineLayoutAccess().getPointPointParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_rulePolyLineLayout7912);
            	    lv_point_2_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolyLineLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"point",
            	            		lv_point_2_0, 
            	            		"Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3581:3: ( (lv_layout_3_0= ruleShapestyleLayout ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3582:1: (lv_layout_3_0= ruleShapestyleLayout )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3582:1: (lv_layout_3_0= ruleShapestyleLayout )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3583:3: lv_layout_3_0= ruleShapestyleLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolyLineLayoutAccess().getLayoutShapestyleLayoutParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShapestyleLayout_in_rulePolyLineLayout7934);
                    lv_layout_3_0=ruleShapestyleLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPolyLineLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_3_0, 
                            		"ShapestyleLayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyLineLayout"


    // $ANTLR start "entryRuleRoundedRectangleLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3607:1: entryRuleRoundedRectangleLayout returns [EObject current=null] : iv_ruleRoundedRectangleLayout= ruleRoundedRectangleLayout EOF ;
    public final EObject entryRuleRoundedRectangleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundedRectangleLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3608:2: (iv_ruleRoundedRectangleLayout= ruleRoundedRectangleLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3609:2: iv_ruleRoundedRectangleLayout= ruleRoundedRectangleLayout EOF
            {
             newCompositeNode(grammarAccess.getRoundedRectangleLayoutRule()); 
            pushFollow(FOLLOW_ruleRoundedRectangleLayout_in_entryRuleRoundedRectangleLayout7972);
            iv_ruleRoundedRectangleLayout=ruleRoundedRectangleLayout();

            state._fsp--;

             current =iv_ruleRoundedRectangleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoundedRectangleLayout7982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundedRectangleLayout"


    // $ANTLR start "ruleRoundedRectangleLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3616:1: ruleRoundedRectangleLayout returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleRoundedRectangleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_curveWidth_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_curveHeight_11_0=null;
        Token otherlv_12=null;
        EObject lv_common_2_0 = null;

        EObject lv_layout_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3619:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3620:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3620:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3620:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3620:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3621:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoundedRectangleLayoutAccess().getRoundedRectangleLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3626:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3628:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3628:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3629:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3632:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3633:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3633:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=4;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==17||LA47_0==53) && getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 2) ) {
                    alt47=3;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3635:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3635:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3636:5: {...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3636:119: ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3637:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3640:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3640:7: {...}? => ( (lv_common_2_0= ruleCommonLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3640:16: ( (lv_common_2_0= ruleCommonLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3641:1: (lv_common_2_0= ruleCommonLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3641:1: (lv_common_2_0= ruleCommonLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3642:3: lv_common_2_0= ruleCommonLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoundedRectangleLayoutAccess().getCommonCommonLayoutParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommonLayout_in_ruleRoundedRectangleLayout8082);
            	    lv_common_2_0=ruleCommonLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoundedRectangleLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"common",
            	            		lv_common_2_0, 
            	            		"CommonLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3665:4: ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3665:4: ({...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3666:5: {...}? => ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3666:119: ( ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3667:6: ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3670:6: ({...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3670:7: {...}? => (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3670:16: (otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3670:18: otherlv_3= 'curve' otherlv_4= '(' otherlv_5= 'width' otherlv_6= '=' ( (lv_curveWidth_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'height' otherlv_10= '=' ( (lv_curveHeight_11_0= RULE_INT ) ) otherlv_12= ')'
            	    {
            	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleRoundedRectangleLayout8149); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRoundedRectangleLayoutAccess().getCurveKeyword_1_1_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRoundedRectangleLayout8161); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRoundedRectangleLayoutAccess().getLeftParenthesisKeyword_1_1_1());
            	        
            	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleRoundedRectangleLayout8173); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoundedRectangleLayoutAccess().getWidthKeyword_1_1_2());
            	        
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRoundedRectangleLayout8185); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRoundedRectangleLayoutAccess().getEqualsSignKeyword_1_1_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3686:1: ( (lv_curveWidth_7_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3687:1: (lv_curveWidth_7_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3687:1: (lv_curveWidth_7_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3688:3: lv_curveWidth_7_0= RULE_INT
            	    {
            	    lv_curveWidth_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRoundedRectangleLayout8202); 

            	    			newLeafNode(lv_curveWidth_7_0, grammarAccess.getRoundedRectangleLayoutAccess().getCurveWidthINTTerminalRuleCall_1_1_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoundedRectangleLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"curveWidth",
            	            		lv_curveWidth_7_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRoundedRectangleLayout8219); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRoundedRectangleLayoutAccess().getCommaKeyword_1_1_5());
            	        
            	    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleRoundedRectangleLayout8231); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRoundedRectangleLayoutAccess().getHeightKeyword_1_1_6());
            	        
            	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleRoundedRectangleLayout8243); 

            	        	newLeafNode(otherlv_10, grammarAccess.getRoundedRectangleLayoutAccess().getEqualsSignKeyword_1_1_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3716:1: ( (lv_curveHeight_11_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3717:1: (lv_curveHeight_11_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3717:1: (lv_curveHeight_11_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3718:3: lv_curveHeight_11_0= RULE_INT
            	    {
            	    lv_curveHeight_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRoundedRectangleLayout8260); 

            	    			newLeafNode(lv_curveHeight_11_0, grammarAccess.getRoundedRectangleLayoutAccess().getCurveHeightINTTerminalRuleCall_1_1_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoundedRectangleLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"curveHeight",
            	            		lv_curveHeight_11_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleRoundedRectangleLayout8277); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRoundedRectangleLayoutAccess().getRightParenthesisKeyword_1_1_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3745:4: ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3745:4: ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3746:5: {...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3746:119: ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3747:6: ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3750:6: ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3750:7: {...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3750:16: ( (lv_layout_13_0= ruleShapestyleLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3751:1: (lv_layout_13_0= ruleShapestyleLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3751:1: (lv_layout_13_0= ruleShapestyleLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3752:3: lv_layout_13_0= ruleShapestyleLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoundedRectangleLayoutAccess().getLayoutShapestyleLayoutParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShapestyleLayout_in_ruleRoundedRectangleLayout8353);
            	    lv_layout_13_0=ruleShapestyleLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoundedRectangleLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"layout",
            	            		lv_layout_13_0, 
            	            		"ShapestyleLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleRoundedRectangleLayout", "getUnorderedGroupHelper().canLeave(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRoundedRectangleLayoutAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundedRectangleLayout"


    // $ANTLR start "entryRuleTextLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3791:1: entryRuleTextLayout returns [EObject current=null] : iv_ruleTextLayout= ruleTextLayout EOF ;
    public final EObject entryRuleTextLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3792:2: (iv_ruleTextLayout= ruleTextLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3793:2: iv_ruleTextLayout= ruleTextLayout EOF
            {
             newCompositeNode(grammarAccess.getTextLayoutRule()); 
            pushFollow(FOLLOW_ruleTextLayout_in_entryRuleTextLayout8435);
            iv_ruleTextLayout=ruleTextLayout();

            state._fsp--;

             current =iv_ruleTextLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextLayout8445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextLayout"


    // $ANTLR start "ruleTextLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3800:1: ruleTextLayout returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleTextLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_common_2_0 = null;

        Enumerator lv_hAlign_7_0 = null;

        Enumerator lv_vAlign_11_0 = null;

        EObject lv_layout_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3803:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3804:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3804:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3804:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3804:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3805:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextLayoutAccess().getTextLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3810:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3812:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3812:1: ( ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3813:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3816:2: ( ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?)
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3817:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3817:3: ( ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=4;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==17||LA49_0==53) && getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3819:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3819:4: ({...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3820:5: {...}? => ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3820:107: ( ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3821:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3824:6: ({...}? => ( (lv_common_2_0= ruleCommonLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3824:7: {...}? => ( (lv_common_2_0= ruleCommonLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3824:16: ( (lv_common_2_0= ruleCommonLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3825:1: (lv_common_2_0= ruleCommonLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3825:1: (lv_common_2_0= ruleCommonLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3826:3: lv_common_2_0= ruleCommonLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextLayoutAccess().getCommonCommonLayoutParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommonLayout_in_ruleTextLayout8545);
            	    lv_common_2_0=ruleCommonLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"common",
            	            		lv_common_2_0, 
            	            		"CommonLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3849:4: ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3849:4: ({...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3850:5: {...}? => ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3850:107: ( ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3851:6: ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3854:6: ({...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3854:7: {...}? => (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3854:16: (otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3854:18: otherlv_3= 'align' otherlv_4= '(' (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )? otherlv_12= ')'
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleTextLayout8612); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTextLayout8624); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3862:1: (otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) ) )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==39) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3862:3: otherlv_5= 'horizontal' otherlv_6= '=' ( (lv_hAlign_7_0= ruleHAlign ) ) otherlv_8= ',' otherlv_9= 'vertical' otherlv_10= '=' ( (lv_vAlign_11_0= ruleVAlign ) )
            	            {
            	            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleTextLayout8637); 

            	                	newLeafNode(otherlv_5, grammarAccess.getTextLayoutAccess().getHorizontalKeyword_1_1_2_0());
            	                
            	            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleTextLayout8649); 

            	                	newLeafNode(otherlv_6, grammarAccess.getTextLayoutAccess().getEqualsSignKeyword_1_1_2_1());
            	                
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3870:1: ( (lv_hAlign_7_0= ruleHAlign ) )
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3871:1: (lv_hAlign_7_0= ruleHAlign )
            	            {
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3871:1: (lv_hAlign_7_0= ruleHAlign )
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3872:3: lv_hAlign_7_0= ruleHAlign
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextLayoutAccess().getHAlignHAlignEnumRuleCall_1_1_2_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleHAlign_in_ruleTextLayout8670);
            	            lv_hAlign_7_0=ruleHAlign();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextLayoutRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"hAlign",
            	                    		lv_hAlign_7_0, 
            	                    		"HAlign");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleTextLayout8682); 

            	                	newLeafNode(otherlv_8, grammarAccess.getTextLayoutAccess().getCommaKeyword_1_1_2_3());
            	                
            	            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleTextLayout8694); 

            	                	newLeafNode(otherlv_9, grammarAccess.getTextLayoutAccess().getVerticalKeyword_1_1_2_4());
            	                
            	            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleTextLayout8706); 

            	                	newLeafNode(otherlv_10, grammarAccess.getTextLayoutAccess().getEqualsSignKeyword_1_1_2_5());
            	                
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3900:1: ( (lv_vAlign_11_0= ruleVAlign ) )
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3901:1: (lv_vAlign_11_0= ruleVAlign )
            	            {
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3901:1: (lv_vAlign_11_0= ruleVAlign )
            	            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3902:3: lv_vAlign_11_0= ruleVAlign
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextLayoutAccess().getVAlignVAlignEnumRuleCall_1_1_2_6_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleVAlign_in_ruleTextLayout8727);
            	            lv_vAlign_11_0=ruleVAlign();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextLayoutRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"vAlign",
            	                    		lv_vAlign_11_0, 
            	                    		"VAlign");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleTextLayout8741); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3929:4: ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3929:4: ({...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3930:5: {...}? => ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3930:107: ( ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3931:6: ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3934:6: ({...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3934:7: {...}? => ( (lv_layout_13_0= ruleShapestyleLayout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTextLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3934:16: ( (lv_layout_13_0= ruleShapestyleLayout ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3935:1: (lv_layout_13_0= ruleShapestyleLayout )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3935:1: (lv_layout_13_0= ruleShapestyleLayout )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3936:3: lv_layout_13_0= ruleShapestyleLayout
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextLayoutAccess().getLayoutShapestyleLayoutParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShapestyleLayout_in_ruleTextLayout8817);
            	    lv_layout_13_0=ruleShapestyleLayout();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"layout",
            	            		lv_layout_13_0, 
            	            		"ShapestyleLayout");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTextLayout", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextLayoutAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextLayout"


    // $ANTLR start "entryRuleShapestyleLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3975:1: entryRuleShapestyleLayout returns [EObject current=null] : iv_ruleShapestyleLayout= ruleShapestyleLayout EOF ;
    public final EObject entryRuleShapestyleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapestyleLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3976:2: (iv_ruleShapestyleLayout= ruleShapestyleLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3977:2: iv_ruleShapestyleLayout= ruleShapestyleLayout EOF
            {
             newCompositeNode(grammarAccess.getShapestyleLayoutRule()); 
            pushFollow(FOLLOW_ruleShapestyleLayout_in_entryRuleShapestyleLayout8899);
            iv_ruleShapestyleLayout=ruleShapestyleLayout();

            state._fsp--;

             current =iv_ruleShapestyleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapestyleLayout8909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapestyleLayout"


    // $ANTLR start "ruleShapestyleLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3984:1: ruleShapestyleLayout returns [EObject current=null] : ( () (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' ) ) ;
    public final EObject ruleShapestyleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3987:28: ( ( () (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3988:1: ( () (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3988:1: ( () (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3988:2: () (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3988:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3989:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShapestyleLayoutAccess().getShapestyleLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3994:2: (otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:3994:4: otherlv_1= 'style' otherlv_2= '(' this_INT_3= RULE_INT otherlv_4= ')'
            {
            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleShapestyleLayout8956); 

                	newLeafNode(otherlv_1, grammarAccess.getShapestyleLayoutAccess().getStyleKeyword_1_0());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleShapestyleLayout8968); 

                	newLeafNode(otherlv_2, grammarAccess.getShapestyleLayoutAccess().getLeftParenthesisKeyword_1_1());
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapestyleLayout8979); 
             
                newLeafNode(this_INT_3, grammarAccess.getShapestyleLayoutAccess().getINTTerminalRuleCall_1_2()); 
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleShapestyleLayout8990); 

                	newLeafNode(otherlv_4, grammarAccess.getShapestyleLayoutAccess().getRightParenthesisKeyword_1_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapestyleLayout"


    // $ANTLR start "entryRuleShapeStyleRef"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4018:1: entryRuleShapeStyleRef returns [String current=null] : iv_ruleShapeStyleRef= ruleShapeStyleRef EOF ;
    public final String entryRuleShapeStyleRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShapeStyleRef = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4019:2: (iv_ruleShapeStyleRef= ruleShapeStyleRef EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4020:2: iv_ruleShapeStyleRef= ruleShapeStyleRef EOF
            {
             newCompositeNode(grammarAccess.getShapeStyleRefRule()); 
            pushFollow(FOLLOW_ruleShapeStyleRef_in_entryRuleShapeStyleRef9028);
            iv_ruleShapeStyleRef=ruleShapeStyleRef();

            state._fsp--;

             current =iv_ruleShapeStyleRef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeStyleRef9039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeStyleRef"


    // $ANTLR start "ruleShapeStyleRef"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4027:1: ruleShapeStyleRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'style' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleShapeStyleRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4030:28: ( (kw= 'style' this_INT_1= RULE_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4031:1: (kw= 'style' this_INT_1= RULE_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4031:1: (kw= 'style' this_INT_1= RULE_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4032:2: kw= 'style' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleShapeStyleRef9077); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getShapeStyleRefAccess().getStyleKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShapeStyleRef9092); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getShapeStyleRefAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeStyleRef"


    // $ANTLR start "entryRuleCommonLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4052:1: entryRuleCommonLayout returns [EObject current=null] : iv_ruleCommonLayout= ruleCommonLayout EOF ;
    public final EObject entryRuleCommonLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLayout = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4053:2: (iv_ruleCommonLayout= ruleCommonLayout EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4054:2: iv_ruleCommonLayout= ruleCommonLayout EOF
            {
             newCompositeNode(grammarAccess.getCommonLayoutRule()); 
            pushFollow(FOLLOW_ruleCommonLayout_in_entryRuleCommonLayout9137);
            iv_ruleCommonLayout=ruleCommonLayout();

            state._fsp--;

             current =iv_ruleCommonLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLayout9147); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonLayout"


    // $ANTLR start "ruleCommonLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4061:1: ruleCommonLayout returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleCommonLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_xcor_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_ycor_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_width_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_heigth_20_0=null;
        Token otherlv_21=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4064:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4065:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4065:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4065:2: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4065:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4066:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCommonLayoutAccess().getCommonLayoutAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4071:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4073:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4073:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4074:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1());
            	
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4077:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?)
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4078:3: ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+ {...}?
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4078:3: ( ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==17) ) {
                    int LA50_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 0) ) {
                        alt50=1;
                    }


                }
                else if ( (LA50_0==53) ) {
                    int LA50_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 1) ) {
                        alt50=2;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4080:4: ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4080:4: ({...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4081:5: {...}? => ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCommonLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4081:109: ( ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4082:6: ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4085:6: ({...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4085:7: {...}? => (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCommonLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4085:16: (otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4085:18: otherlv_2= 'position' otherlv_3= '(' otherlv_4= 'x' otherlv_5= '=' ( (lv_xcor_6_0= RULE_INT ) ) otherlv_7= ',' otherlv_8= 'y' otherlv_9= '=' ( (lv_ycor_10_0= RULE_INT ) ) otherlv_11= ')'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCommonLayout9239); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCommonLayoutAccess().getPositionKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCommonLayout9251); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCommonLayoutAccess().getLeftParenthesisKeyword_1_0_1());
            	        
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleCommonLayout9263); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCommonLayoutAccess().getXKeyword_1_0_2());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCommonLayout9275); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCommonLayoutAccess().getEqualsSignKeyword_1_0_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4101:1: ( (lv_xcor_6_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4102:1: (lv_xcor_6_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4102:1: (lv_xcor_6_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4103:3: lv_xcor_6_0= RULE_INT
            	    {
            	    lv_xcor_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommonLayout9292); 

            	    			newLeafNode(lv_xcor_6_0, grammarAccess.getCommonLayoutAccess().getXcorINTTerminalRuleCall_1_0_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommonLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"xcor",
            	            		lv_xcor_6_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleCommonLayout9309); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCommonLayoutAccess().getCommaKeyword_1_0_5());
            	        
            	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCommonLayout9321); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCommonLayoutAccess().getYKeyword_1_0_6());
            	        
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCommonLayout9333); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCommonLayoutAccess().getEqualsSignKeyword_1_0_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4131:1: ( (lv_ycor_10_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4132:1: (lv_ycor_10_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4132:1: (lv_ycor_10_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4133:3: lv_ycor_10_0= RULE_INT
            	    {
            	    lv_ycor_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommonLayout9350); 

            	    			newLeafNode(lv_ycor_10_0, grammarAccess.getCommonLayoutAccess().getYcorINTTerminalRuleCall_1_0_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommonLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"ycor",
            	            		lv_ycor_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCommonLayout9367); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCommonLayoutAccess().getRightParenthesisKeyword_1_0_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4160:4: ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4160:4: ({...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4161:5: {...}? => ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCommonLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4161:109: ( ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4162:6: ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4165:6: ({...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4165:7: {...}? => (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCommonLayout", "true");
            	    }
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4165:16: (otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')' )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4165:18: otherlv_12= 'size' otherlv_13= '(' otherlv_14= 'width' otherlv_15= '=' ( (lv_width_16_0= RULE_INT ) ) otherlv_17= ',' otherlv_18= 'height' otherlv_19= '=' ( (lv_heigth_20_0= RULE_INT ) ) otherlv_21= ')'
            	    {
            	    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleCommonLayout9435); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCommonLayoutAccess().getSizeKeyword_1_1_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleCommonLayout9447); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCommonLayoutAccess().getLeftParenthesisKeyword_1_1_1());
            	        
            	    otherlv_14=(Token)match(input,47,FOLLOW_47_in_ruleCommonLayout9459); 

            	        	newLeafNode(otherlv_14, grammarAccess.getCommonLayoutAccess().getWidthKeyword_1_1_2());
            	        
            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleCommonLayout9471); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCommonLayoutAccess().getEqualsSignKeyword_1_1_3());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4181:1: ( (lv_width_16_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4182:1: (lv_width_16_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4182:1: (lv_width_16_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4183:3: lv_width_16_0= RULE_INT
            	    {
            	    lv_width_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommonLayout9488); 

            	    			newLeafNode(lv_width_16_0, grammarAccess.getCommonLayoutAccess().getWidthINTTerminalRuleCall_1_1_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommonLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"width",
            	            		lv_width_16_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleCommonLayout9505); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCommonLayoutAccess().getCommaKeyword_1_1_5());
            	        
            	    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleCommonLayout9517); 

            	        	newLeafNode(otherlv_18, grammarAccess.getCommonLayoutAccess().getHeightKeyword_1_1_6());
            	        
            	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleCommonLayout9529); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCommonLayoutAccess().getEqualsSignKeyword_1_1_7());
            	        
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4211:1: ( (lv_heigth_20_0= RULE_INT ) )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4212:1: (lv_heigth_20_0= RULE_INT )
            	    {
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4212:1: (lv_heigth_20_0= RULE_INT )
            	    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4213:3: lv_heigth_20_0= RULE_INT
            	    {
            	    lv_heigth_20_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommonLayout9546); 

            	    			newLeafNode(lv_heigth_20_0, grammarAccess.getCommonLayoutAccess().getHeigthINTTerminalRuleCall_1_1_8_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommonLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"heigth",
            	            		lv_heigth_20_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleCommonLayout9563); 

            	        	newLeafNode(otherlv_21, grammarAccess.getCommonLayoutAccess().getRightParenthesisKeyword_1_1_9());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleCommonLayout", "getUnorderedGroupHelper().canLeave(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCommonLayoutAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonLayout"


    // $ANTLR start "entryRuleTextBody"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4256:1: entryRuleTextBody returns [EObject current=null] : iv_ruleTextBody= ruleTextBody EOF ;
    public final EObject entryRuleTextBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBody = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4257:2: (iv_ruleTextBody= ruleTextBody EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4258:2: iv_ruleTextBody= ruleTextBody EOF
            {
             newCompositeNode(grammarAccess.getTextBodyRule()); 
            pushFollow(FOLLOW_ruleTextBody_in_entryRuleTextBody9646);
            iv_ruleTextBody=ruleTextBody();

            state._fsp--;

             current =iv_ruleTextBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBody9656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextBody"


    // $ANTLR start "ruleTextBody"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4265:1: ruleTextBody returns [EObject current=null] : ( () otherlv_1= 'id' otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleTextBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4268:28: ( ( () otherlv_1= 'id' otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4269:1: ( () otherlv_1= 'id' otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4269:1: ( () otherlv_1= 'id' otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4269:2: () otherlv_1= 'id' otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4269:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextBodyAccess().getTextBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleTextBody9702); 

                	newLeafNode(otherlv_1, grammarAccess.getTextBodyAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTextBody9714); 

                	newLeafNode(otherlv_2, grammarAccess.getTextBodyAccess().getEqualsSignKeyword_2());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4283:1: ( (lv_value_3_0= RULE_ID ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4284:1: (lv_value_3_0= RULE_ID )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4284:1: (lv_value_3_0= RULE_ID )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4285:3: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextBody9731); 

            			newLeafNode(lv_value_3_0, grammarAccess.getTextBodyAccess().getValueIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextBody"


    // $ANTLR start "entryRulePoint"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4309:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4310:2: (iv_rulePoint= rulePoint EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4311:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint9772);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint9782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4318:1: rulePoint returns [EObject current=null] : ( () (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_curveBefore_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_curveAfter_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_xcor_5_0 = null;

        AntlrDatatypeRuleToken lv_ycor_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4321:28: ( ( () (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4322:1: ( () (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4322:1: ( () (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4322:2: () (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4322:2: ()
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4323:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPointAccess().getPointAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4328:2: (otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')' )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4328:4: otherlv_1= 'point' otherlv_2= '(' otherlv_3= 'x' otherlv_4= '=' ( (lv_xcor_5_0= ruleN_INT ) ) otherlv_6= ',' otherlv_7= 'y' otherlv_8= '=' ( (lv_ycor_9_0= ruleN_INT ) ) (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )? otherlv_18= ')'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_rulePoint9829); 

                	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getPointKeyword_1_0());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePoint9841); 

                	newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftParenthesisKeyword_1_1());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePoint9853); 

                	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getXKeyword_1_2());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePoint9865); 

                	newLeafNode(otherlv_4, grammarAccess.getPointAccess().getEqualsSignKeyword_1_3());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4344:1: ( (lv_xcor_5_0= ruleN_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4345:1: (lv_xcor_5_0= ruleN_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4345:1: (lv_xcor_5_0= ruleN_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4346:3: lv_xcor_5_0= ruleN_INT
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getXcorN_INTParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleN_INT_in_rulePoint9886);
            lv_xcor_5_0=ruleN_INT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"xcor",
                    		lv_xcor_5_0, 
                    		"N_INT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePoint9898); 

                	newLeafNode(otherlv_6, grammarAccess.getPointAccess().getCommaKeyword_1_5());
                
            otherlv_7=(Token)match(input,29,FOLLOW_29_in_rulePoint9910); 

                	newLeafNode(otherlv_7, grammarAccess.getPointAccess().getYKeyword_1_6());
                
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_rulePoint9922); 

                	newLeafNode(otherlv_8, grammarAccess.getPointAccess().getEqualsSignKeyword_1_7());
                
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4374:1: ( (lv_ycor_9_0= ruleN_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4375:1: (lv_ycor_9_0= ruleN_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4375:1: (lv_ycor_9_0= ruleN_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4376:3: lv_ycor_9_0= ruleN_INT
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getYcorN_INTParserRuleCall_1_8_0()); 
            	    
            pushFollow(FOLLOW_ruleN_INT_in_rulePoint9943);
            lv_ycor_9_0=ruleN_INT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"ycor",
                    		lv_ycor_9_0, 
                    		"N_INT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4392:2: (otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4392:4: otherlv_10= ',' otherlv_11= 'curveBefore' otherlv_12= '=' ( (lv_curveBefore_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'curveAfter' otherlv_16= '=' ( (lv_curveAfter_17_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_rulePoint9956); 

                        	newLeafNode(otherlv_10, grammarAccess.getPointAccess().getCommaKeyword_1_9_0());
                        
                    otherlv_11=(Token)match(input,56,FOLLOW_56_in_rulePoint9968); 

                        	newLeafNode(otherlv_11, grammarAccess.getPointAccess().getCurveBeforeKeyword_1_9_1());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_rulePoint9980); 

                        	newLeafNode(otherlv_12, grammarAccess.getPointAccess().getEqualsSignKeyword_1_9_2());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4404:1: ( (lv_curveBefore_13_0= RULE_INT ) )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4405:1: (lv_curveBefore_13_0= RULE_INT )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4405:1: (lv_curveBefore_13_0= RULE_INT )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4406:3: lv_curveBefore_13_0= RULE_INT
                    {
                    lv_curveBefore_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint9997); 

                    			newLeafNode(lv_curveBefore_13_0, grammarAccess.getPointAccess().getCurveBeforeINTTerminalRuleCall_1_9_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"curveBefore",
                            		lv_curveBefore_13_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_rulePoint10014); 

                        	newLeafNode(otherlv_14, grammarAccess.getPointAccess().getCommaKeyword_1_9_4());
                        
                    otherlv_15=(Token)match(input,57,FOLLOW_57_in_rulePoint10026); 

                        	newLeafNode(otherlv_15, grammarAccess.getPointAccess().getCurveAfterKeyword_1_9_5());
                        
                    otherlv_16=(Token)match(input,20,FOLLOW_20_in_rulePoint10038); 

                        	newLeafNode(otherlv_16, grammarAccess.getPointAccess().getEqualsSignKeyword_1_9_6());
                        
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4434:1: ( (lv_curveAfter_17_0= RULE_INT ) )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4435:1: (lv_curveAfter_17_0= RULE_INT )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4435:1: (lv_curveAfter_17_0= RULE_INT )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4436:3: lv_curveAfter_17_0= RULE_INT
                    {
                    lv_curveAfter_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePoint10055); 

                    			newLeafNode(lv_curveAfter_17_0, grammarAccess.getPointAccess().getCurveAfterINTTerminalRuleCall_1_9_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"curveAfter",
                            		lv_curveAfter_17_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,24,FOLLOW_24_in_rulePoint10074); 

                	newLeafNode(otherlv_18, grammarAccess.getPointAccess().getRightParenthesisKeyword_1_10());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleBoolean"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4464:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4465:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4466:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean10112);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean10123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4473:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4476:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4477:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4477:1: (kw= 'true' | kw= 'false' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            else if ( (LA52_0==59) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4478:2: kw= 'true'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBoolean10161); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4485:2: kw= 'false'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleBoolean10180); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleN_INT"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4498:1: entryRuleN_INT returns [String current=null] : iv_ruleN_INT= ruleN_INT EOF ;
    public final String entryRuleN_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleN_INT = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4499:2: (iv_ruleN_INT= ruleN_INT EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4500:2: iv_ruleN_INT= ruleN_INT EOF
            {
             newCompositeNode(grammarAccess.getN_INTRule()); 
            pushFollow(FOLLOW_ruleN_INT_in_entryRuleN_INT10221);
            iv_ruleN_INT=ruleN_INT();

            state._fsp--;

             current =iv_ruleN_INT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleN_INT10232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleN_INT"


    // $ANTLR start "ruleN_INT"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4507:1: ruleN_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleN_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4510:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4511:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4511:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4511:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4511:2: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==60) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4512:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleN_INT10271); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getN_INTAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleN_INT10288); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getN_INTAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleN_INT"


    // $ANTLR start "entryRuleDOUBLE"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4532:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4533:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4534:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE10334);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE10345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4541:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4544:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4545:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4545:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4545:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE10385); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,61,FOLLOW_61_in_ruleDOUBLE10403); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE10418); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "ruleCompartmentLayout"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4573:1: ruleCompartmentLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'vertical' ) | (enumLiteral_2= 'horizontal' ) | (enumLiteral_3= 'fit' ) ) ;
    public final Enumerator ruleCompartmentLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4575:28: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'vertical' ) | (enumLiteral_2= 'horizontal' ) | (enumLiteral_3= 'fit' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4576:1: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'vertical' ) | (enumLiteral_2= 'horizontal' ) | (enumLiteral_3= 'fit' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4576:1: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'vertical' ) | (enumLiteral_2= 'horizontal' ) | (enumLiteral_3= 'fit' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt54=1;
                }
                break;
            case 40:
                {
                alt54=2;
                }
                break;
            case 39:
                {
                alt54=3;
                }
                break;
            case 63:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4576:2: (enumLiteral_0= 'fixed' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4576:2: (enumLiteral_0= 'fixed' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4576:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleCompartmentLayout10477); 

                            current = grammarAccess.getCompartmentLayoutAccess().getFIXEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompartmentLayoutAccess().getFIXEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4582:6: (enumLiteral_1= 'vertical' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4582:6: (enumLiteral_1= 'vertical' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4582:8: enumLiteral_1= 'vertical'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleCompartmentLayout10494); 

                            current = grammarAccess.getCompartmentLayoutAccess().getVERTICALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompartmentLayoutAccess().getVERTICALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4588:6: (enumLiteral_2= 'horizontal' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4588:6: (enumLiteral_2= 'horizontal' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4588:8: enumLiteral_2= 'horizontal'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleCompartmentLayout10511); 

                            current = grammarAccess.getCompartmentLayoutAccess().getHORIZONTALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompartmentLayoutAccess().getHORIZONTALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4594:6: (enumLiteral_3= 'fit' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4594:6: (enumLiteral_3= 'fit' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4594:8: enumLiteral_3= 'fit'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleCompartmentLayout10528); 

                            current = grammarAccess.getCompartmentLayoutAccess().getFITEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCompartmentLayoutAccess().getFITEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentLayout"


    // $ANTLR start "ruleHAlign"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4604:1: ruleHAlign returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleHAlign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4606:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4607:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4607:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt55=1;
                }
                break;
            case 65:
                {
                alt55=2;
                }
                break;
            case 66:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4607:2: (enumLiteral_0= 'left' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4607:2: (enumLiteral_0= 'left' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4607:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleHAlign10573); 

                            current = grammarAccess.getHAlignAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHAlignAccess().getLEFTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4613:6: (enumLiteral_1= 'center' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4613:6: (enumLiteral_1= 'center' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4613:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleHAlign10590); 

                            current = grammarAccess.getHAlignAccess().getCENTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHAlignAccess().getCENTEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4619:6: (enumLiteral_2= 'right' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4619:6: (enumLiteral_2= 'right' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4619:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleHAlign10607); 

                            current = grammarAccess.getHAlignAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHAlignAccess().getRIGHTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHAlign"


    // $ANTLR start "ruleVAlign"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4629:1: ruleVAlign returns [Enumerator current=null] : ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'bottom' ) ) ;
    public final Enumerator ruleVAlign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4631:28: ( ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'bottom' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4632:1: ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'bottom' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4632:1: ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'middle' ) | (enumLiteral_2= 'bottom' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt56=1;
                }
                break;
            case 68:
                {
                alt56=2;
                }
                break;
            case 69:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4632:2: (enumLiteral_0= 'top' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4632:2: (enumLiteral_0= 'top' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4632:4: enumLiteral_0= 'top'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleVAlign10652); 

                            current = grammarAccess.getVAlignAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVAlignAccess().getTOPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4638:6: (enumLiteral_1= 'middle' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4638:6: (enumLiteral_1= 'middle' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4638:8: enumLiteral_1= 'middle'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleVAlign10669); 

                            current = grammarAccess.getVAlignAccess().getMIDDLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVAlignAccess().getMIDDLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4644:6: (enumLiteral_2= 'bottom' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4644:6: (enumLiteral_2= 'bottom' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4644:8: enumLiteral_2= 'bottom'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleVAlign10686); 

                            current = grammarAccess.getVAlignAccess().getBOTTOMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVAlignAccess().getBOTTOMEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVAlign"


    // $ANTLR start "ruleConnectionStyle"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4654:1: ruleConnectionStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'freeform' ) | (enumLiteral_1= 'manhatten' ) ) ;
    public final Enumerator ruleConnectionStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4656:28: ( ( (enumLiteral_0= 'freeform' ) | (enumLiteral_1= 'manhatten' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4657:1: ( (enumLiteral_0= 'freeform' ) | (enumLiteral_1= 'manhatten' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4657:1: ( (enumLiteral_0= 'freeform' ) | (enumLiteral_1= 'manhatten' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==70) ) {
                alt57=1;
            }
            else if ( (LA57_0==71) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4657:2: (enumLiteral_0= 'freeform' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4657:2: (enumLiteral_0= 'freeform' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4657:4: enumLiteral_0= 'freeform'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleConnectionStyle10731); 

                            current = grammarAccess.getConnectionStyleAccess().getFreeformEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionStyleAccess().getFreeformEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4663:6: (enumLiteral_1= 'manhatten' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4663:6: (enumLiteral_1= 'manhatten' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4663:8: enumLiteral_1= 'manhatten'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleConnectionStyle10748); 

                            current = grammarAccess.getConnectionStyleAccess().getManhattenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionStyleAccess().getManhattenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionStyle"


    // $ANTLR start "ruleAnchorPredefiniedEnum"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4673:1: ruleAnchorPredefiniedEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'corners' ) ) ;
    public final Enumerator ruleAnchorPredefiniedEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4675:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'corners' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4676:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'corners' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4676:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'corners' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            else if ( (LA58_0==72) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4676:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4676:2: (enumLiteral_0= 'center' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4676:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleAnchorPredefiniedEnum10793); 

                            current = grammarAccess.getAnchorPredefiniedEnumAccess().getCenterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorPredefiniedEnumAccess().getCenterEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4682:6: (enumLiteral_1= 'corners' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4682:6: (enumLiteral_1= 'corners' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4682:8: enumLiteral_1= 'corners'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleAnchorPredefiniedEnum10810); 

                            current = grammarAccess.getAnchorPredefiniedEnumAccess().getCornersEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnchorPredefiniedEnumAccess().getCornersEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorPredefiniedEnum"


    // $ANTLR start "ruleTextType"
    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4692:1: ruleTextType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'wrapped-text' ) ) ;
    public final Enumerator ruleTextType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4694:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'wrapped-text' ) ) )
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4695:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'wrapped-text' ) )
            {
            // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4695:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'wrapped-text' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==73) ) {
                alt59=1;
            }
            else if ( (LA59_0==74) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4695:2: (enumLiteral_0= 'text' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4695:2: (enumLiteral_0= 'text' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4695:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleTextType10855); 

                            current = grammarAccess.getTextTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTextTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4701:6: (enumLiteral_1= 'wrapped-text' )
                    {
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4701:6: (enumLiteral_1= 'wrapped-text' )
                    // ../org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:4701:8: enumLiteral_1= 'wrapped-text'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleTextType10872); 

                            current = grammarAccess.getTextTypeAccess().getMultilineEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTextTypeAccess().getMultilineEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleShapeContainer_in_entryRuleShapeContainer75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeContainer85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeContainerElement_in_ruleShapeContainer130 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_ruleShapeContainerElement_in_entryRuleShapeContainerElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeContainerElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeDefinition_in_ruleShapeContainerElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDefinition_in_ruleShapeContainerElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDefinition_in_entryRuleConnectionDefinition285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConnectionDefinition332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectionDefinition349 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleConnectionDefinition375 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnectionDefinition388 = new BitSet(new long[]{0x0010000000016000L});
    public static final BitSet FOLLOW_13_in_ruleConnectionDefinition401 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleConnectionStyle_in_ruleConnectionDefinition422 = new BitSet(new long[]{0x0010000000014000L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_ruleConnectionDefinition445 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rulePlacingDefinition_in_ruleConnectionDefinition467 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleConnectionDefinition480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeDefinition_in_entryRuleShapeDefinition516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeDefinition526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleShapeDefinition563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShapeDefinition580 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleShapeDefinition606 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleShapeDefinition619 = new BitSet(new long[]{0x0006404FC0000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShapeLayout_in_ruleShapeDefinition640 = new BitSet(new long[]{0x0006404FC0000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShape_in_ruleShapeDefinition661 = new BitSet(new long[]{0x0006504FC2004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleShapeDefinition683 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleShapeDefinition705 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleShapeDefinition718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlacingDefinition_in_entryRulePlacingDefinition754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlacingDefinition764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePlacingDefinition801 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePlacingDefinition813 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlacingDefinition825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePlacingDefinition837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlacingDefinition849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlacingDefinition861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rulePlacingDefinition882 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_rulePlacingDefinition895 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePlacingDefinition907 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlacingDefinition919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlacingDefinition936 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePlacingDefinition953 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePlacingDefinition965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlacingDefinition977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlacingDefinition994 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlacingDefinition1013 = new BitSet(new long[]{0x0006404FC0000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShapeConnection_in_rulePlacingDefinition1034 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlacingDefinition1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAnchor1129 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000102L});
    public static final BitSet FOLLOW_ruleAnchorType_in_ruleAnchor1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorType_in_entryRuleAnchorType1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorType1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorPredefinied_in_ruleAnchorType1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorManual_in_ruleAnchorType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorPredefinied_in_entryRuleAnchorPredefinied1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorPredefinied1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorPredefiniedEnum_in_ruleAnchorPredefinied1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorManual_in_entryRuleAnchorManual1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorManual1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAnchorManual1442 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleAnchorPosition_in_ruleAnchorManual1463 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleAnchorManual1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorPosition_in_entryRuleAnchorPosition1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorPosition1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAnchorPosition1559 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAnchorPosition1571 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_ruleAnchorPositionPos_in_ruleAnchorPosition1592 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAnchorPosition1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorPositionPos_in_entryRuleAnchorPositionPos1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorPositionPos1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorRelativePosition_in_ruleAnchorPositionPos1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorFixPointPosition_in_ruleAnchorPositionPos1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorRelativePosition_in_entryRuleAnchorRelativePosition1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorRelativePosition1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAnchorRelativePosition1806 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnchorRelativePosition1818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleAnchorRelativePosition1839 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAnchorRelativePosition1851 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAnchorRelativePosition1863 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnchorRelativePosition1875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleAnchorRelativePosition1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchorFixPointPosition_in_entryRuleAnchorFixPointPosition1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchorFixPointPosition1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAnchorFixPointPosition1979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnchorFixPointPosition1991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAnchorFixPointPosition2008 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAnchorFixPointPosition2025 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnchorFixPointPosition2037 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnchorFixPointPosition2049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAnchorFixPointPosition2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShape_in_entryRuleShape2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShape2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleShape2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_ruleShape2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_ruleShape2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundedRectangle_in_ruleShape2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygon_in_ruleShape2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_ruleShape2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleShape2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeConnection_in_entryRuleShapeConnection2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeConnection2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDLine_in_ruleShapeConnection2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDPolyline_in_ruleShapeConnection2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDRectangle_in_ruleShapeConnection2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDRoundedRectangle_in_ruleShapeConnection2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDPolygon_in_ruleShapeConnection2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDEllipse_in_ruleShapeConnection2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDText_in_ruleShapeConnection2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDLine_in_entryRuleCDLine2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDLine2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCDLine2671 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDLine2692 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDLine2706 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLineLayout_in_ruleCDLine2727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDLine2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDPolyline_in_entryRuleCDPolyline2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDPolyline2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCDPolyline2832 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDPolyline2853 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDPolyline2867 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePolyLineLayout_in_ruleCDPolyline2888 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDPolyline2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDRectangle_in_entryRuleCDRectangle2937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDRectangle2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCDRectangle2993 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDRectangle3014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDRectangle3028 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleCDRectangle3049 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDRectangle3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDRoundedRectangle_in_entryRuleCDRoundedRectangle3098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDRoundedRectangle3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCDRoundedRectangle3154 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDRoundedRectangle3175 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDRoundedRectangle3189 = new BitSet(new long[]{0x0038000000020000L});
    public static final BitSet FOLLOW_ruleRoundedRectangleLayout_in_ruleCDRoundedRectangle3210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDRoundedRectangle3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDPolygon_in_entryRuleCDPolygon3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDPolygon3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCDPolygon3315 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDPolygon3336 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDPolygon3350 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePolyLineLayout_in_ruleCDPolygon3371 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDPolygon3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDEllipse_in_entryRuleCDEllipse3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDEllipse3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCDEllipse3476 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDEllipse3497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDEllipse3511 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleCDEllipse3532 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDEllipse3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCDText_in_entryRuleCDText3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCDText3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextType_in_ruleCDText3646 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleCDText3667 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCDText3681 = new BitSet(new long[]{0x0030200000020000L});
    public static final BitSet FOLLOW_ruleTextLayout_in_ruleCDText3702 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleCDText3723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCDText3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine3772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLine3828 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleLine3849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLine3863 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLineLayout_in_ruleLine3884 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLine3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyline_in_entryRulePolyline3933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolyline3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePolyline3989 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_rulePolyline4010 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolyline4024 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePolyLineLayout_in_rulePolyline4045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePolyline4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangle4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRectangle4150 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleRectangle4171 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRectangle4185 = new BitSet(new long[]{0x0030001000020000L});
    public static final BitSet FOLLOW_ruleCompartmentInfo_in_ruleRectangle4206 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleRectangle4228 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShape_in_ruleRectangle4249 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_14_in_ruleRectangle4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundedRectangle_in_entryRuleRoundedRectangle4299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoundedRectangle4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRoundedRectangle4355 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleRoundedRectangle4376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRoundedRectangle4390 = new BitSet(new long[]{0x0038000000020000L});
    public static final BitSet FOLLOW_ruleRoundedRectangleLayout_in_ruleRoundedRectangle4411 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShape_in_ruleRoundedRectangle4432 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_14_in_ruleRoundedRectangle4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygon_in_entryRulePolygon4482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolygon4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePolygon4538 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_rulePolygon4559 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolygon4573 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePolyLineLayout_in_rulePolygon4594 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShape_in_rulePolygon4615 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_14_in_rulePolygon4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEllipse_in_entryRuleEllipse4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEllipse4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEllipse4721 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleEllipse4742 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEllipse4756 = new BitSet(new long[]{0x0030001000020000L});
    public static final BitSet FOLLOW_ruleCompartmentInfo_in_ruleEllipse4777 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleEllipse4799 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleShape_in_ruleEllipse4820 = new BitSet(new long[]{0x0006404FC0004000L,0x0000000000000600L});
    public static final BitSet FOLLOW_14_in_ruleEllipse4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextType_in_ruleText4935 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleText4956 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleText4970 = new BitSet(new long[]{0x0030200000020000L});
    public static final BitSet FOLLOW_ruleTextLayout_in_ruleText4991 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleText5012 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleText5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentInfo_in_entryRuleCompartmentInfo5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentInfo5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompartmentInfo5108 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompartmentInfo5120 = new BitSet(new long[]{0x00400E6000000000L});
    public static final BitSet FOLLOW_37_in_ruleCompartmentInfo5178 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompartmentInfo5190 = new BitSet(new long[]{0xC000018000000000L});
    public static final BitSet FOLLOW_ruleCompartmentLayout_in_ruleCompartmentInfo5211 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_38_in_ruleCompartmentInfo5279 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompartmentInfo5291 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCompartmentInfo5303 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompartmentInfo5315 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleCompartmentInfo5336 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCompartmentInfo5348 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCompartmentInfo5360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompartmentInfo5372 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleCompartmentInfo5393 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompartmentInfo5405 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_41_in_ruleCompartmentInfo5473 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompartmentInfo5485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompartmentInfo5502 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_42_in_ruleCompartmentInfo5575 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompartmentInfo5587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompartmentInfo5604 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_43_in_ruleCompartmentInfo5682 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleCompartmentInfo5770 = new BitSet(new long[]{0x00400E6001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompartmentInfo5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentShape_in_entryRuleCompartmentShape5866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentShape5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentEllipse_in_ruleCompartmentShape5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentRectangle_in_ruleCompartmentShape5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentRectangle_in_entryRuleCompartmentRectangle5985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentRectangle5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompartmentRectangle6041 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartmentRectangle6054 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleCompartmentRectangle6075 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleCompartmentRectangle6096 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartmentRectangle6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentEllipse_in_entryRuleCompartmentEllipse6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentEllipse6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompartmentEllipse6205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartmentEllipse6218 = new BitSet(new long[]{0x0030000000020000L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_ruleCompartmentEllipse6239 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleCompartmentEllipse6260 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartmentEllipse6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription6309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDescription6366 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_ruleDescription6387 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDescription6400 = new BitSet(new long[]{0x0040200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDescription6413 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDescription6425 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_39_in_ruleDescription6438 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDescription6450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleHAlign_in_ruleDescription6471 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDescription6483 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDescription6495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDescription6507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleVAlign_in_ruleDescription6528 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDescription6542 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTextBody_in_ruleDescription6565 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDescription6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeLayout_in_entryRuleShapeLayout6614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeLayout6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleShapeLayout6716 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleShapeLayout6728 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleShapeLayout6740 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout6752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapeLayout6769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleShapeLayout6786 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleShapeLayout6798 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout6810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapeLayout6827 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShapeLayout6844 = new BitSet(new long[]{0x0006404000000002L});
    public static final BitSet FOLLOW_49_in_ruleShapeLayout6912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleShapeLayout6924 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleShapeLayout6936 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout6948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapeLayout6965 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleShapeLayout6982 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleShapeLayout6994 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout7006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapeLayout7023 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShapeLayout7040 = new BitSet(new long[]{0x0006404000000002L});
    public static final BitSet FOLLOW_38_in_ruleShapeLayout7108 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleShapeLayout7120 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleShapeLayout7132 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout7144 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleShapeLayout7165 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleShapeLayout7177 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleShapeLayout7189 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout7201 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleShapeLayout7222 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShapeLayout7234 = new BitSet(new long[]{0x0006404000000002L});
    public static final BitSet FOLLOW_50_in_ruleShapeLayout7302 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleShapeLayout7314 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleShapeLayout7335 = new BitSet(new long[]{0x0006404000000002L});
    public static final BitSet FOLLOW_ruleRectangleEllipseLayout_in_entryRuleRectangleEllipseLayout7412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRectangleEllipseLayout7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLayout_in_ruleRectangleEllipseLayout7522 = new BitSet(new long[]{0x0030000000020002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_ruleRectangleEllipseLayout7597 = new BitSet(new long[]{0x0030000000020002L});
    public static final BitSet FOLLOW_ruleLineLayout_in_entryRuleLineLayout7679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineLayout7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_ruleLineLayout7745 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_ruleLineLayout7766 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_ruleLineLayout7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolyLineLayout_in_entryRulePolyLineLayout7825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolyLineLayout7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyLineLayout7891 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rulePoint_in_rulePolyLineLayout7912 = new BitSet(new long[]{0x0090000000000002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_rulePolyLineLayout7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundedRectangleLayout_in_entryRuleRoundedRectangleLayout7972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoundedRectangleLayout7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLayout_in_ruleRoundedRectangleLayout8082 = new BitSet(new long[]{0x0038000000020002L});
    public static final BitSet FOLLOW_51_in_ruleRoundedRectangleLayout8149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRoundedRectangleLayout8161 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRoundedRectangleLayout8173 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRoundedRectangleLayout8185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRoundedRectangleLayout8202 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRoundedRectangleLayout8219 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRoundedRectangleLayout8231 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRoundedRectangleLayout8243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRoundedRectangleLayout8260 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRoundedRectangleLayout8277 = new BitSet(new long[]{0x0038000000020002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_ruleRoundedRectangleLayout8353 = new BitSet(new long[]{0x0038000000020002L});
    public static final BitSet FOLLOW_ruleTextLayout_in_entryRuleTextLayout8435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextLayout8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLayout_in_ruleTextLayout8545 = new BitSet(new long[]{0x0030200000020002L});
    public static final BitSet FOLLOW_45_in_ruleTextLayout8612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTextLayout8624 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_39_in_ruleTextLayout8637 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextLayout8649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleHAlign_in_ruleTextLayout8670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextLayout8682 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTextLayout8694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextLayout8706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleVAlign_in_ruleTextLayout8727 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTextLayout8741 = new BitSet(new long[]{0x0030200000020002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_ruleTextLayout8817 = new BitSet(new long[]{0x0030200000020002L});
    public static final BitSet FOLLOW_ruleShapestyleLayout_in_entryRuleShapestyleLayout8899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapestyleLayout8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleShapestyleLayout8956 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleShapestyleLayout8968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapestyleLayout8979 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShapestyleLayout8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeStyleRef_in_entryRuleShapeStyleRef9028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeStyleRef9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleShapeStyleRef9077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShapeStyleRef9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLayout_in_entryRuleCommonLayout9137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLayout9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCommonLayout9239 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCommonLayout9251 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommonLayout9263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommonLayout9275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommonLayout9292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommonLayout9309 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCommonLayout9321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommonLayout9333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommonLayout9350 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommonLayout9367 = new BitSet(new long[]{0x0020000000020002L});
    public static final BitSet FOLLOW_53_in_ruleCommonLayout9435 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCommonLayout9447 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCommonLayout9459 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommonLayout9471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommonLayout9488 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommonLayout9505 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCommonLayout9517 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommonLayout9529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommonLayout9546 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommonLayout9563 = new BitSet(new long[]{0x0020000000020002L});
    public static final BitSet FOLLOW_ruleTextBody_in_entryRuleTextBody9646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBody9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTextBody9702 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextBody9714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextBody9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint9772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePoint9829 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePoint9841 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePoint9853 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePoint9865 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_ruleN_INT_in_rulePoint9886 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePoint9898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePoint9910 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePoint9922 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_ruleN_INT_in_rulePoint9943 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_rulePoint9956 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePoint9968 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePoint9980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint9997 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePoint10014 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePoint10026 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePoint10038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePoint10055 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePoint10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean10112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBoolean10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBoolean10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleN_INT_in_entryRuleN_INT10221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleN_INT10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleN_INT10271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleN_INT10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE10334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE10385 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleDOUBLE10403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCompartmentLayout10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompartmentLayout10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCompartmentLayout10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCompartmentLayout10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleHAlign10573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleHAlign10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleHAlign10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleVAlign10652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleVAlign10669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleVAlign10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleConnectionStyle10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleConnectionStyle10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAnchorPredefiniedEnum10793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAnchorPredefiniedEnum10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTextType10855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTextType10872 = new BitSet(new long[]{0x0000000000000002L});

}
