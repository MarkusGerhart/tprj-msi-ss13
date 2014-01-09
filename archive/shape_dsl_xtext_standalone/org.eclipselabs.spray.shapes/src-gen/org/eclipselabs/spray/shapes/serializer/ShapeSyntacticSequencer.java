package org.eclipselabs.spray.shapes.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipselabs.spray.shapes.services.ShapeGrammarAccess;

@SuppressWarnings("all")
public class ShapeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ShapeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q;
	protected AbstractElementAlias match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a;
	protected AbstractElementAlias match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a;
	protected AbstractElementAlias match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ShapeGrammarAccess) access;
		match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getAlignKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_1_3_1()), new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_1_3_3()));
		match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()));
		match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()));
		match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q.equals(syntax))
				emit_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a.equals(syntax))
				emit_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a.equals(syntax))
				emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p.equals(syntax))
				emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('align' '(' ')')?
	 */
	protected void emit_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('align' '(' ')')*
	 */
	protected void emit_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (')' 'align' '(')*
	 */
	protected void emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (')' 'align' '(')+
	 */
	protected void emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
