package org.eclipselabs.spray.shapes.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipselabs.spray.shapes.services.ShapeGrammarAccess;
import org.eclipselabs.spray.shapes.shape.Anchor;
import org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.shape.AnchorManual;
import org.eclipselabs.spray.shapes.shape.AnchorPosition;
import org.eclipselabs.spray.shapes.shape.AnchorPredefinied;
import org.eclipselabs.spray.shapes.shape.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.shape.CDEllipse;
import org.eclipselabs.spray.shapes.shape.CDLine;
import org.eclipselabs.spray.shapes.shape.CDPolygon;
import org.eclipselabs.spray.shapes.shape.CDPolyline;
import org.eclipselabs.spray.shapes.shape.CDRectangle;
import org.eclipselabs.spray.shapes.shape.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.shape.CDText;
import org.eclipselabs.spray.shapes.shape.CommonLayout;
import org.eclipselabs.spray.shapes.shape.Compartment;
import org.eclipselabs.spray.shapes.shape.CompartmentEllipse;
import org.eclipselabs.spray.shapes.shape.CompartmentInfo;
import org.eclipselabs.spray.shapes.shape.CompartmentPolygon;
import org.eclipselabs.spray.shapes.shape.CompartmentRectangle;
import org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle;
import org.eclipselabs.spray.shapes.shape.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shape.Description;
import org.eclipselabs.spray.shapes.shape.Ellipse;
import org.eclipselabs.spray.shapes.shape.Line;
import org.eclipselabs.spray.shapes.shape.LineLayout;
import org.eclipselabs.spray.shapes.shape.PlacingDefinition;
import org.eclipselabs.spray.shapes.shape.Point;
import org.eclipselabs.spray.shapes.shape.PolyLineLayout;
import org.eclipselabs.spray.shapes.shape.Polygon;
import org.eclipselabs.spray.shapes.shape.Polyline;
import org.eclipselabs.spray.shapes.shape.Rectangle;
import org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.shape.RoundedRectangle;
import org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.shape.ShapeContainer;
import org.eclipselabs.spray.shapes.shape.ShapeDefinition;
import org.eclipselabs.spray.shapes.shape.ShapeLayout;
import org.eclipselabs.spray.shapes.shape.ShapePackage;
import org.eclipselabs.spray.shapes.shape.ShapestyleLayout;
import org.eclipselabs.spray.shapes.shape.Text;
import org.eclipselabs.spray.shapes.shape.TextBody;
import org.eclipselabs.spray.shapes.shape.TextLayout;

@SuppressWarnings("all")
public class ShapeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ShapeGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ShapePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ShapePackage.ANCHOR:
				if(context == grammarAccess.getAnchorRule()) {
					sequence_Anchor(context, (Anchor) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ANCHOR_FIX_POINT_POSITION:
				if(context == grammarAccess.getAnchorFixPointPositionRule() ||
				   context == grammarAccess.getAnchorPositionPosRule()) {
					sequence_AnchorFixPointPosition(context, (AnchorFixPointPosition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ANCHOR_MANUAL:
				if(context == grammarAccess.getAnchorManualRule() ||
				   context == grammarAccess.getAnchorTypeRule()) {
					sequence_AnchorManual(context, (AnchorManual) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ANCHOR_POSITION:
				if(context == grammarAccess.getAnchorPositionRule()) {
					sequence_AnchorPosition(context, (AnchorPosition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ANCHOR_PREDEFINIED:
				if(context == grammarAccess.getAnchorPredefiniedRule() ||
				   context == grammarAccess.getAnchorTypeRule()) {
					sequence_AnchorPredefinied(context, (AnchorPredefinied) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ANCHOR_RELATIVE_POSITION:
				if(context == grammarAccess.getAnchorPositionPosRule() ||
				   context == grammarAccess.getAnchorRelativePositionRule()) {
					sequence_AnchorRelativePosition(context, (AnchorRelativePosition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_ELLIPSE:
				if(context == grammarAccess.getCDEllipseRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDEllipse(context, (CDEllipse) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_LINE:
				if(context == grammarAccess.getCDLineRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDLine(context, (CDLine) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_POLYGON:
				if(context == grammarAccess.getCDPolygonRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDPolygon(context, (CDPolygon) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_POLYLINE:
				if(context == grammarAccess.getCDPolylineRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDPolyline(context, (CDPolyline) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_RECTANGLE:
				if(context == grammarAccess.getCDRectangleRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDRectangle(context, (CDRectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_ROUNDED_RECTANGLE:
				if(context == grammarAccess.getCDRoundedRectangleRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDRoundedRectangle(context, (CDRoundedRectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CD_TEXT:
				if(context == grammarAccess.getCDTextRule() ||
				   context == grammarAccess.getShapeConnectionRule()) {
					sequence_CDText(context, (CDText) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMMON_LAYOUT:
				if(context == grammarAccess.getCommonLayoutRule()) {
					sequence_CommonLayout(context, (CommonLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT:
				if(context == grammarAccess.getCompartmentRule()) {
					sequence_Compartment(context, (Compartment) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT_ELLIPSE:
				if(context == grammarAccess.getCompartmentEllipseRule() ||
				   context == grammarAccess.getCompartmentShapeRule()) {
					sequence_CompartmentEllipse(context, (CompartmentEllipse) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT_INFO:
				if(context == grammarAccess.getCompartmentInfoRule()) {
					sequence_CompartmentInfo(context, (CompartmentInfo) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT_POLYGON:
				if(context == grammarAccess.getCompartmentPolygonRule()) {
					sequence_CompartmentPolygon(context, (CompartmentPolygon) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT_RECTANGLE:
				if(context == grammarAccess.getCompartmentRectangleRule() ||
				   context == grammarAccess.getCompartmentShapeRule()) {
					sequence_CompartmentRectangle(context, (CompartmentRectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.COMPARTMENT_ROUNDED_RECTANGLE:
				if(context == grammarAccess.getCompartmentRoundedRectangleRule()) {
					sequence_CompartmentRoundedRectangle(context, (CompartmentRoundedRectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.CONNECTION_DEFINITION:
				if(context == grammarAccess.getConnectionDefinitionRule() ||
				   context == grammarAccess.getShapeContainerElementRule()) {
					sequence_ConnectionDefinition(context, (ConnectionDefinition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.DESCRIPTION:
				if(context == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ELLIPSE:
				if(context == grammarAccess.getEllipseRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Ellipse(context, (Ellipse) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.LINE:
				if(context == grammarAccess.getLineRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Line(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.LINE_LAYOUT:
				if(context == grammarAccess.getLineLayoutRule()) {
					sequence_LineLayout(context, (LineLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.PLACING_DEFINITION:
				if(context == grammarAccess.getPlacingDefinitionRule()) {
					sequence_PlacingDefinition(context, (PlacingDefinition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.POLY_LINE_LAYOUT:
				if(context == grammarAccess.getPolyLineLayoutRule()) {
					sequence_PolyLineLayout(context, (PolyLineLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.POLYGON:
				if(context == grammarAccess.getPolygonRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Polygon(context, (Polygon) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.POLYLINE:
				if(context == grammarAccess.getPolylineRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Polyline(context, (Polyline) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.RECTANGLE:
				if(context == grammarAccess.getRectangleRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Rectangle(context, (Rectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.RECTANGLE_ELLIPSE_LAYOUT:
				if(context == grammarAccess.getRectangleEllipseLayoutRule()) {
					sequence_RectangleEllipseLayout(context, (RectangleEllipseLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ROUNDED_RECTANGLE:
				if(context == grammarAccess.getRoundedRectangleRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_RoundedRectangle(context, (RoundedRectangle) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.ROUNDED_RECTANGLE_LAYOUT:
				if(context == grammarAccess.getRoundedRectangleLayoutRule()) {
					sequence_RoundedRectangleLayout(context, (RoundedRectangleLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.SHAPE_CONTAINER:
				if(context == grammarAccess.getShapeContainerRule()) {
					sequence_ShapeContainer(context, (ShapeContainer) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.SHAPE_DEFINITION:
				if(context == grammarAccess.getShapeContainerElementRule() ||
				   context == grammarAccess.getShapeDefinitionRule()) {
					sequence_ShapeDefinition(context, (ShapeDefinition) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.SHAPE_LAYOUT:
				if(context == grammarAccess.getShapeLayoutRule()) {
					sequence_ShapeLayout(context, (ShapeLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.SHAPESTYLE_LAYOUT:
				if(context == grammarAccess.getShapestyleLayoutRule()) {
					sequence_ShapestyleLayout(context, (ShapestyleLayout) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.TEXT:
				if(context == grammarAccess.getShapeRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.TEXT_BODY:
				if(context == grammarAccess.getTextBodyRule()) {
					sequence_TextBody(context, (TextBody) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.TEXT_LAYOUT:
				if(context == grammarAccess.getTextLayoutRule()) {
					sequence_TextLayout(context, (TextLayout) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (xcor=INT ycor=INT)
	 */
	protected void sequence_AnchorFixPointPosition(EObject context, AnchorFixPointPosition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_FIX_POINT_POSITION__XCOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_FIX_POINT_POSITION__XCOR));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_FIX_POINT_POSITION__YCOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_FIX_POINT_POSITION__YCOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnchorFixPointPositionAccess().getXcorINTTerminalRuleCall_2_0(), semanticObject.getXcor());
		feeder.accept(grammarAccess.getAnchorFixPointPositionAccess().getYcorINTTerminalRuleCall_6_0(), semanticObject.getYcor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     position+=AnchorPosition+
	 */
	protected void sequence_AnchorManual(EObject context, AnchorManual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pos=AnchorPositionPos
	 */
	protected void sequence_AnchorPosition(EObject context, AnchorPosition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_POSITION__POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_POSITION__POS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnchorPositionAccess().getPosAnchorPositionPosParserRuleCall_2_0(), semanticObject.getPos());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=AnchorPredefiniedEnum
	 */
	protected void sequence_AnchorPredefinied(EObject context, AnchorPredefinied semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_PREDEFINIED__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_PREDEFINIED__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnchorPredefiniedAccess().getValueAnchorPredefiniedEnumEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (xoffset=DOUBLE yoffset=DOUBLE)
	 */
	protected void sequence_AnchorRelativePosition(EObject context, AnchorRelativePosition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR_RELATIVE_POSITION__YOFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR_RELATIVE_POSITION__YOFFSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnchorRelativePositionAccess().getXoffsetDOUBLEParserRuleCall_2_0(), semanticObject.getXoffset());
		feeder.accept(grammarAccess.getAnchorRelativePositionAccess().getYoffsetDOUBLEParserRuleCall_6_0(), semanticObject.getYoffset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AnchorType
	 */
	protected void sequence_Anchor(EObject context, Anchor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.ANCHOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.ANCHOR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnchorAccess().getTypeAnchorTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=RectangleEllipseLayout)
	 */
	protected void sequence_CDEllipse(EObject context, CDEllipse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=LineLayout)
	 */
	protected void sequence_CDLine(EObject context, CDLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=PolyLineLayout)
	 */
	protected void sequence_CDPolygon(EObject context, CDPolygon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=PolyLineLayout)
	 */
	protected void sequence_CDPolyline(EObject context, CDPolyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=RectangleEllipseLayout)
	 */
	protected void sequence_CDRectangle(EObject context, CDRectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=RoundedRectangleLayout)
	 */
	protected void sequence_CDRoundedRectangle(EObject context, CDRoundedRectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (texttype=TextType style=ShapeStyleRef? layout=TextLayout body=TextBody)
	 */
	protected void sequence_CDText(EObject context, CDText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((xcor=INT ycor=INT)? width=INT heigth=INT)
	 */
	protected void sequence_CommonLayout(EObject context, CommonLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layout=RectangleEllipseLayout id=TextBody)
	 */
	protected void sequence_CompartmentEllipse(EObject context, CompartmentEllipse semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__LAYOUT));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompartmentEllipseAccess().getLayoutRectangleEllipseLayoutParserRuleCall_2_1_0(), semanticObject.getLayout());
		feeder.accept(grammarAccess.getCompartmentEllipseAccess().getIdTextBodyParserRuleCall_2_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         compartmentLayout=CompartmentLayout 
	 *         (stretchH=Boolean stretchV=Boolean)? 
	 *         spacing=INT? 
	 *         margin=INT? 
	 *         invisible?='invisible'? 
	 *         id=TextBody?
	 *     )
	 */
	protected void sequence_CompartmentInfo(EObject context, CompartmentInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layout=PolyLineLayout id=TextBody)
	 */
	protected void sequence_CompartmentPolygon(EObject context, CompartmentPolygon semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_POLYGON__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_POLYGON__LAYOUT));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_POLYGON__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_POLYGON__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompartmentPolygonAccess().getLayoutPolyLineLayoutParserRuleCall_2_1_0(), semanticObject.getLayout());
		feeder.accept(grammarAccess.getCompartmentPolygonAccess().getIdTextBodyParserRuleCall_2_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (layout=RectangleEllipseLayout id=TextBody)
	 */
	protected void sequence_CompartmentRectangle(EObject context, CompartmentRectangle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__LAYOUT));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_SHAPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompartmentRectangleAccess().getLayoutRectangleEllipseLayoutParserRuleCall_2_1_0(), semanticObject.getLayout());
		feeder.accept(grammarAccess.getCompartmentRectangleAccess().getIdTextBodyParserRuleCall_2_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (layout=RoundedRectangleLayout id=TextBody)
	 */
	protected void sequence_CompartmentRoundedRectangle(EObject context, CompartmentRoundedRectangle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT));
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.COMPARTMENT_ROUNDED_RECTANGLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.COMPARTMENT_ROUNDED_RECTANGLE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompartmentRoundedRectangleAccess().getLayoutRoundedRectangleLayoutParserRuleCall_2_1_0(), semanticObject.getLayout());
		feeder.accept(grammarAccess.getCompartmentRoundedRectangleAccess().getIdTextBodyParserRuleCall_2_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (compartmentLayout=CompartmentLayout? shape=CompartmentShape)
	 */
	protected void sequence_Compartment(EObject context, Compartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID style=ShapeStyleRef? connectionStyle=ConnectionStyle? layout=ShapestyleLayout? placing+=PlacingDefinition*)
	 */
	protected void sequence_ConnectionDefinition(EObject context, ConnectionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? (hAlign=HAlign vAlign=VAlign)? body=TextBody)
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? compartmentInfo=CompartmentInfo? layout=RectangleEllipseLayout shape+=Shape*)
	 */
	protected void sequence_Ellipse(EObject context, Ellipse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (point+=Point point+=Point layout=ShapestyleLayout?)
	 */
	protected void sequence_LineLayout(EObject context, LineLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=LineLayout)
	 */
	protected void sequence_Line(EObject context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (offset=DOUBLE (distance=INT angle=INT)? shapeCon=ShapeConnection)
	 */
	protected void sequence_PlacingDefinition(EObject context, PlacingDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (xcor=N_INT ycor=N_INT (curveBefore=INT curveAfter=INT)?)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (point+=Point point+=Point+ layout=ShapestyleLayout?)
	 */
	protected void sequence_PolyLineLayout(EObject context, PolyLineLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=PolyLineLayout shape+=Shape*)
	 */
	protected void sequence_Polygon(EObject context, Polygon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=PolyLineLayout)
	 */
	protected void sequence_Polyline(EObject context, Polyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (common=CommonLayout layout=ShapestyleLayout?)
	 */
	protected void sequence_RectangleEllipseLayout(EObject context, RectangleEllipseLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? compartmentInfo=CompartmentInfo? layout=RectangleEllipseLayout shape+=Shape*)
	 */
	protected void sequence_Rectangle(EObject context, Rectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (common=CommonLayout curveWidth=INT curveHeight=INT layout=ShapestyleLayout?)
	 */
	protected void sequence_RoundedRectangleLayout(EObject context, RoundedRectangleLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=ShapeStyleRef? layout=RoundedRectangleLayout shape+=Shape*)
	 */
	protected void sequence_RoundedRectangle(EObject context, RoundedRectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     shapeContainerElement+=ShapeContainerElement*
	 */
	protected void sequence_ShapeContainer(EObject context, ShapeContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         style=ShapeStyleRef? 
	 *         shapeLayout=ShapeLayout 
	 *         shape+=Shape+ 
	 *         description=Description? 
	 *         anchor=Anchor?
	 *     )
	 */
	protected void sequence_ShapeDefinition(EObject context, ShapeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((minwidth=INT minheight=INT)? (maxwidth=INT maxheight=INT)? (stretchH=Boolean stretchV=Boolean)? proportional=Boolean?)
	 */
	protected void sequence_ShapeLayout(EObject context, ShapeLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShapestyleLayout}
	 */
	protected void sequence_ShapestyleLayout(EObject context, ShapestyleLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_TextBody(EObject context, TextBody semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.TEXT_BODY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.TEXT_BODY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextBodyAccess().getValueIDTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (common=CommonLayout (hAlign=HAlign vAlign=VAlign)? layout=ShapestyleLayout?)
	 */
	protected void sequence_TextLayout(EObject context, TextLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (texttype=TextType style=ShapeStyleRef? layout=TextLayout body=TextBody)
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
