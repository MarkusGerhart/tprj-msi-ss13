/**
 */
package org.eclipselabs.spray.shapes.shape;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.shape.ShapeFactory
 * @model kind="package"
 * @generated
 */
public interface ShapePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "shape";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/spray/shapes/Shape";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "shape";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ShapePackage eINSTANCE = org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeContainerImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeContainer()
   * @generated
   */
  int SHAPE_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Shape Container Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeContainerElementImpl <em>Container Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeContainerElementImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeContainerElement()
   * @generated
   */
  int SHAPE_CONTAINER_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONTAINER_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONTAINER_ELEMENT__STYLE = 1;

  /**
   * The number of structural features of the '<em>Container Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ConnectionDefinitionImpl <em>Connection Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ConnectionDefinitionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getConnectionDefinition()
   * @generated
   */
  int CONNECTION_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION__NAME = SHAPE_CONTAINER_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION__STYLE = SHAPE_CONTAINER_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Connection Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION__CONNECTION_STYLE = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION__LAYOUT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Placing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION__PLACING = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Connection Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_DEFINITION_FEATURE_COUNT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeDefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeDefinitionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeDefinition()
   * @generated
   */
  int SHAPE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__NAME = SHAPE_CONTAINER_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__STYLE = SHAPE_CONTAINER_ELEMENT__STYLE;

  /**
   * The feature id for the '<em><b>Shape Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__SHAPE_LAYOUT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__SHAPE = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__DESCRIPTION = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Anchor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION__ANCHOR = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DEFINITION_FEATURE_COUNT = SHAPE_CONTAINER_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.PlacingDefinitionImpl <em>Placing Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.PlacingDefinitionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPlacingDefinition()
   * @generated
   */
  int PLACING_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_DEFINITION__OFFSET = 0;

  /**
   * The feature id for the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_DEFINITION__DISTANCE = 1;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_DEFINITION__ANGLE = 2;

  /**
   * The feature id for the '<em><b>Shape Con</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_DEFINITION__SHAPE_CON = 3;

  /**
   * The number of structural features of the '<em>Placing Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACING_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorImpl <em>Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchor()
   * @generated
   */
  int ANCHOR = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__TYPE = 0;

  /**
   * The number of structural features of the '<em>Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorTypeImpl <em>Anchor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorTypeImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorType()
   * @generated
   */
  int ANCHOR_TYPE = 6;

  /**
   * The number of structural features of the '<em>Anchor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPredefiniedImpl <em>Anchor Predefinied</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPredefiniedImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPredefinied()
   * @generated
   */
  int ANCHOR_PREDEFINIED = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_PREDEFINIED__VALUE = ANCHOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anchor Predefinied</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_PREDEFINIED_FEATURE_COUNT = ANCHOR_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorManualImpl <em>Anchor Manual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorManualImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorManual()
   * @generated
   */
  int ANCHOR_MANUAL = 8;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_MANUAL__POSITION = ANCHOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anchor Manual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_MANUAL_FEATURE_COUNT = ANCHOR_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPositionImpl <em>Anchor Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPositionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPosition()
   * @generated
   */
  int ANCHOR_POSITION = 9;

  /**
   * The feature id for the '<em><b>Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_POSITION__POS = 0;

  /**
   * The number of structural features of the '<em>Anchor Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_POSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPositionPosImpl <em>Anchor Position Pos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPositionPosImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPositionPos()
   * @generated
   */
  int ANCHOR_POSITION_POS = 10;

  /**
   * The number of structural features of the '<em>Anchor Position Pos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_POSITION_POS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorRelativePositionImpl <em>Anchor Relative Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorRelativePositionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorRelativePosition()
   * @generated
   */
  int ANCHOR_RELATIVE_POSITION = 11;

  /**
   * The feature id for the '<em><b>Xoffset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_RELATIVE_POSITION__XOFFSET = ANCHOR_POSITION_POS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Yoffset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_RELATIVE_POSITION__YOFFSET = ANCHOR_POSITION_POS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anchor Relative Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_RELATIVE_POSITION_FEATURE_COUNT = ANCHOR_POSITION_POS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorFixPointPositionImpl <em>Anchor Fix Point Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.AnchorFixPointPositionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorFixPointPosition()
   * @generated
   */
  int ANCHOR_FIX_POINT_POSITION = 12;

  /**
   * The feature id for the '<em><b>Xcor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FIX_POINT_POSITION__XCOR = ANCHOR_POSITION_POS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ycor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FIX_POINT_POSITION__YCOR = ANCHOR_POSITION_POS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anchor Fix Point Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FIX_POINT_POSITION_FEATURE_COUNT = ANCHOR_POSITION_POS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeImpl <em>Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShape()
   * @generated
   */
  int SHAPE = 13;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE__STYLE = 0;

  /**
   * The number of structural features of the '<em>Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeConnectionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeConnection()
   * @generated
   */
  int SHAPE_CONNECTION = 14;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONNECTION__STYLE = 0;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_CONNECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDLineImpl <em>CD Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDLineImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDLine()
   * @generated
   */
  int CD_LINE = 15;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_LINE__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_LINE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_LINE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDPolylineImpl <em>CD Polyline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDPolylineImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDPolyline()
   * @generated
   */
  int CD_POLYLINE = 16;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYLINE__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYLINE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Polyline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYLINE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDRectangleImpl <em>CD Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDRectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDRectangle()
   * @generated
   */
  int CD_RECTANGLE = 17;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_RECTANGLE__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_RECTANGLE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_RECTANGLE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDRoundedRectangleImpl <em>CD Rounded Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDRoundedRectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDRoundedRectangle()
   * @generated
   */
  int CD_ROUNDED_RECTANGLE = 18;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ROUNDED_RECTANGLE__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ROUNDED_RECTANGLE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Rounded Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDPolygonImpl <em>CD Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDPolygonImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDPolygon()
   * @generated
   */
  int CD_POLYGON = 19;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYGON__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYGON__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_POLYGON_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDEllipseImpl <em>CD Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDEllipseImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDEllipse()
   * @generated
   */
  int CD_ELLIPSE = 20;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ELLIPSE__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ELLIPSE__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CD Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_ELLIPSE_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDTextImpl <em>CD Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CDTextImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDText()
   * @generated
   */
  int CD_TEXT = 21;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_TEXT__STYLE = SHAPE_CONNECTION__STYLE;

  /**
   * The feature id for the '<em><b>Texttype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_TEXT__TEXTTYPE = SHAPE_CONNECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_TEXT__LAYOUT = SHAPE_CONNECTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_TEXT__BODY = SHAPE_CONNECTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>CD Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CD_TEXT_FEATURE_COUNT = SHAPE_CONNECTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.LineImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getLine()
   * @generated
   */
  int LINE = 22;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolylineImpl <em>Polyline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.PolylineImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolyline()
   * @generated
   */
  int POLYLINE = 23;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Polyline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.RectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 24;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Compartment Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__COMPARTMENT_INFO = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__LAYOUT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRoundedRectangle()
   * @generated
   */
  int ROUNDED_RECTANGLE = 25;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE__LAYOUT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rounded Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolygonImpl <em>Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.PolygonImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolygon()
   * @generated
   */
  int POLYGON = 26;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__LAYOUT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__SHAPE = SHAPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.EllipseImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 27;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Compartment Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__COMPARTMENT_INFO = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__LAYOUT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__SHAPE = SHAPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.TextImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getText()
   * @generated
   */
  int TEXT = 28;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__STYLE = SHAPE__STYLE;

  /**
   * The feature id for the '<em><b>Texttype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXTTYPE = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__LAYOUT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__BODY = SHAPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentInfoImpl <em>Compartment Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentInfoImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentInfo()
   * @generated
   */
  int COMPARTMENT_INFO = 29;

  /**
   * The feature id for the '<em><b>Compartment Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__COMPARTMENT_LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Stretch H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__STRETCH_H = 1;

  /**
   * The feature id for the '<em><b>Stretch V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__STRETCH_V = 2;

  /**
   * The feature id for the '<em><b>Spacing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__SPACING = 3;

  /**
   * The feature id for the '<em><b>Margin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__MARGIN = 4;

  /**
   * The feature id for the '<em><b>Invisible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__INVISIBLE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO__ID = 6;

  /**
   * The number of structural features of the '<em>Compartment Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INFO_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentImpl <em>Compartment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartment()
   * @generated
   */
  int COMPARTMENT = 30;

  /**
   * The feature id for the '<em><b>Compartment Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__COMPARTMENT_LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__SHAPE = 1;

  /**
   * The number of structural features of the '<em>Compartment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentShapeImpl <em>Compartment Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentShapeImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentShape()
   * @generated
   */
  int COMPARTMENT_SHAPE = 31;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_SHAPE__LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_SHAPE__ID = 1;

  /**
   * The number of structural features of the '<em>Compartment Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_SHAPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentRectangleImpl <em>Compartment Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentRectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentRectangle()
   * @generated
   */
  int COMPARTMENT_RECTANGLE = 32;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_RECTANGLE__LAYOUT = COMPARTMENT_SHAPE__LAYOUT;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_RECTANGLE__ID = COMPARTMENT_SHAPE__ID;

  /**
   * The number of structural features of the '<em>Compartment Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_RECTANGLE_FEATURE_COUNT = COMPARTMENT_SHAPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentRoundedRectangleImpl <em>Compartment Rounded Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentRoundedRectangleImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentRoundedRectangle()
   * @generated
   */
  int COMPARTMENT_ROUNDED_RECTANGLE = 33;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ROUNDED_RECTANGLE__ID = 1;

  /**
   * The number of structural features of the '<em>Compartment Rounded Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ROUNDED_RECTANGLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentPolygonImpl <em>Compartment Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentPolygonImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentPolygon()
   * @generated
   */
  int COMPARTMENT_POLYGON = 34;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_POLYGON__LAYOUT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_POLYGON__ID = 1;

  /**
   * The number of structural features of the '<em>Compartment Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_POLYGON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentEllipseImpl <em>Compartment Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentEllipseImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentEllipse()
   * @generated
   */
  int COMPARTMENT_ELLIPSE = 35;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ELLIPSE__LAYOUT = COMPARTMENT_SHAPE__LAYOUT;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ELLIPSE__ID = COMPARTMENT_SHAPE__ID;

  /**
   * The number of structural features of the '<em>Compartment Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_ELLIPSE_FEATURE_COUNT = COMPARTMENT_SHAPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 36;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__STYLE = 0;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__HALIGN = 1;

  /**
   * The feature id for the '<em><b>VAlign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__VALIGN = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__BODY = 3;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeLayout()
   * @generated
   */
  int SHAPE_LAYOUT = 37;

  /**
   * The feature id for the '<em><b>Minwidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__MINWIDTH = 0;

  /**
   * The feature id for the '<em><b>Minheight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__MINHEIGHT = 1;

  /**
   * The feature id for the '<em><b>Maxwidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__MAXWIDTH = 2;

  /**
   * The feature id for the '<em><b>Maxheight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__MAXHEIGHT = 3;

  /**
   * The feature id for the '<em><b>Stretch H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__STRETCH_H = 4;

  /**
   * The feature id for the '<em><b>Stretch V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__STRETCH_V = 5;

  /**
   * The feature id for the '<em><b>Proportional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT__PROPORTIONAL = 6;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_LAYOUT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.RectangleEllipseLayoutImpl <em>Rectangle Ellipse Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.RectangleEllipseLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRectangleEllipseLayout()
   * @generated
   */
  int RECTANGLE_ELLIPSE_LAYOUT = 38;

  /**
   * The feature id for the '<em><b>Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_ELLIPSE_LAYOUT__COMMON = 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_ELLIPSE_LAYOUT__LAYOUT = 1;

  /**
   * The number of structural features of the '<em>Rectangle Ellipse Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_ELLIPSE_LAYOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.LineLayoutImpl <em>Line Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.LineLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getLineLayout()
   * @generated
   */
  int LINE_LAYOUT = 39;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_LAYOUT__POINT = 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_LAYOUT__LAYOUT = 1;

  /**
   * The number of structural features of the '<em>Line Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_LAYOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolyLineLayoutImpl <em>Poly Line Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.PolyLineLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolyLineLayout()
   * @generated
   */
  int POLY_LINE_LAYOUT = 40;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLY_LINE_LAYOUT__POINT = 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLY_LINE_LAYOUT__LAYOUT = 1;

  /**
   * The number of structural features of the '<em>Poly Line Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLY_LINE_LAYOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleLayoutImpl <em>Rounded Rectangle Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRoundedRectangleLayout()
   * @generated
   */
  int ROUNDED_RECTANGLE_LAYOUT = 41;

  /**
   * The feature id for the '<em><b>Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_LAYOUT__COMMON = 0;

  /**
   * The feature id for the '<em><b>Curve Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH = 1;

  /**
   * The feature id for the '<em><b>Curve Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT = 2;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_LAYOUT__LAYOUT = 3;

  /**
   * The number of structural features of the '<em>Rounded Rectangle Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUNDED_RECTANGLE_LAYOUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextLayoutImpl <em>Text Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.TextLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextLayout()
   * @generated
   */
  int TEXT_LAYOUT = 42;

  /**
   * The feature id for the '<em><b>Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LAYOUT__COMMON = 0;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LAYOUT__HALIGN = 1;

  /**
   * The feature id for the '<em><b>VAlign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LAYOUT__VALIGN = 2;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LAYOUT__LAYOUT = 3;

  /**
   * The number of structural features of the '<em>Text Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LAYOUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapestyleLayoutImpl <em>Shapestyle Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapestyleLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapestyleLayout()
   * @generated
   */
  int SHAPESTYLE_LAYOUT = 43;

  /**
   * The number of structural features of the '<em>Shapestyle Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPESTYLE_LAYOUT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.CommonLayoutImpl <em>Common Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.CommonLayoutImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCommonLayout()
   * @generated
   */
  int COMMON_LAYOUT = 44;

  /**
   * The feature id for the '<em><b>Xcor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LAYOUT__XCOR = 0;

  /**
   * The feature id for the '<em><b>Ycor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LAYOUT__YCOR = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LAYOUT__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Heigth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LAYOUT__HEIGTH = 3;

  /**
   * The number of structural features of the '<em>Common Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LAYOUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextBodyImpl <em>Text Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.TextBodyImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextBody()
   * @generated
   */
  int TEXT_BODY = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BODY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Text Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.impl.PointImpl
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPoint()
   * @generated
   */
  int POINT = 46;

  /**
   * The feature id for the '<em><b>Xcor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__XCOR = 0;

  /**
   * The feature id for the '<em><b>Ycor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__YCOR = 1;

  /**
   * The feature id for the '<em><b>Curve Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__CURVE_BEFORE = 2;

  /**
   * The feature id for the '<em><b>Curve After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__CURVE_AFTER = 3;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.CompartmentLayout <em>Compartment Layout</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.CompartmentLayout
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentLayout()
   * @generated
   */
  int COMPARTMENT_LAYOUT = 47;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.HAlign <em>HAlign</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.HAlign
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getHAlign()
   * @generated
   */
  int HALIGN = 48;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.VAlign <em>VAlign</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.VAlign
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getVAlign()
   * @generated
   */
  int VALIGN = 49;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.ConnectionStyle <em>Connection Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.ConnectionStyle
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getConnectionStyle()
   * @generated
   */
  int CONNECTION_STYLE = 50;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPredefiniedEnum()
   * @generated
   */
  int ANCHOR_PREDEFINIED_ENUM = 51;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.shapes.shape.TextType <em>Text Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.shapes.shape.TextType
   * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextType()
   * @generated
   */
  int TEXT_TYPE = 52;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapeContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainer
   * @generated
   */
  EClass getShapeContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.ShapeContainer#getShapeContainerElement <em>Shape Container Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape Container Element</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainer#getShapeContainerElement()
   * @see #getShapeContainer()
   * @generated
   */
  EReference getShapeContainer_ShapeContainerElement();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapeContainerElement <em>Container Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Element</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainerElement
   * @generated
   */
  EClass getShapeContainerElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeContainerElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainerElement#getName()
   * @see #getShapeContainerElement()
   * @generated
   */
  EAttribute getShapeContainerElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeContainerElement#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainerElement#getStyle()
   * @see #getShapeContainerElement()
   * @generated
   */
  EAttribute getShapeContainerElement_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ConnectionDefinition <em>Connection Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection Definition</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionDefinition
   * @generated
   */
  EClass getConnectionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getConnectionStyle <em>Connection Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getConnectionStyle()
   * @see #getConnectionDefinition()
   * @generated
   */
  EAttribute getConnectionDefinition_ConnectionStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getLayout()
   * @see #getConnectionDefinition()
   * @generated
   */
  EReference getConnectionDefinition_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getPlacing <em>Placing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Placing</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionDefinition#getPlacing()
   * @see #getConnectionDefinition()
   * @generated
   */
  EReference getConnectionDefinition_Placing();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition
   * @generated
   */
  EClass getShapeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition#getShapeLayout <em>Shape Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition#getShapeLayout()
   * @see #getShapeDefinition()
   * @generated
   */
  EReference getShapeDefinition_ShapeLayout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition#getShape()
   * @see #getShapeDefinition()
   * @generated
   */
  EReference getShapeDefinition_Shape();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition#getDescription()
   * @see #getShapeDefinition()
   * @generated
   */
  EReference getShapeDefinition_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition#getAnchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anchor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition#getAnchor()
   * @see #getShapeDefinition()
   * @generated
   */
  EReference getShapeDefinition_Anchor();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition <em>Placing Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Placing Definition</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition
   * @generated
   */
  EClass getPlacingDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition#getOffset()
   * @see #getPlacingDefinition()
   * @generated
   */
  EAttribute getPlacingDefinition_Offset();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition#getDistance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distance</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition#getDistance()
   * @see #getPlacingDefinition()
   * @generated
   */
  EAttribute getPlacingDefinition_Distance();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition#getAngle()
   * @see #getPlacingDefinition()
   * @generated
   */
  EAttribute getPlacingDefinition_Angle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition#getShapeCon <em>Shape Con</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape Con</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition#getShapeCon()
   * @see #getPlacingDefinition()
   * @generated
   */
  EReference getPlacingDefinition_ShapeCon();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Anchor
   * @generated
   */
  EClass getAnchor();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Anchor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Anchor#getType()
   * @see #getAnchor()
   * @generated
   */
  EReference getAnchor_Type();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorType <em>Anchor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Type</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorType
   * @generated
   */
  EClass getAnchorType();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefinied <em>Anchor Predefinied</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Predefinied</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefinied
   * @generated
   */
  EClass getAnchorPredefinied();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefinied#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefinied#getValue()
   * @see #getAnchorPredefinied()
   * @generated
   */
  EAttribute getAnchorPredefinied_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorManual <em>Anchor Manual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Manual</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorManual
   * @generated
   */
  EClass getAnchorManual();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.AnchorManual#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Position</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorManual#getPosition()
   * @see #getAnchorManual()
   * @generated
   */
  EReference getAnchorManual_Position();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorPosition <em>Anchor Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Position</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPosition
   * @generated
   */
  EClass getAnchorPosition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.AnchorPosition#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pos</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPosition#getPos()
   * @see #getAnchorPosition()
   * @generated
   */
  EReference getAnchorPosition_Pos();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorPositionPos <em>Anchor Position Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Position Pos</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPositionPos
   * @generated
   */
  EClass getAnchorPositionPos();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorRelativePosition <em>Anchor Relative Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Relative Position</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorRelativePosition
   * @generated
   */
  EClass getAnchorRelativePosition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.AnchorRelativePosition#getXoffset <em>Xoffset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xoffset</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorRelativePosition#getXoffset()
   * @see #getAnchorRelativePosition()
   * @generated
   */
  EAttribute getAnchorRelativePosition_Xoffset();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.AnchorRelativePosition#getYoffset <em>Yoffset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yoffset</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorRelativePosition#getYoffset()
   * @see #getAnchorRelativePosition()
   * @generated
   */
  EAttribute getAnchorRelativePosition_Yoffset();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition <em>Anchor Fix Point Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor Fix Point Position</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition
   * @generated
   */
  EClass getAnchorFixPointPosition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition#getXcor <em>Xcor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xcor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition#getXcor()
   * @see #getAnchorFixPointPosition()
   * @generated
   */
  EAttribute getAnchorFixPointPosition_Xcor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition#getYcor <em>Ycor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ycor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition#getYcor()
   * @see #getAnchorFixPointPosition()
   * @generated
   */
  EAttribute getAnchorFixPointPosition_Ycor();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Shape
   * @generated
   */
  EClass getShape();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Shape#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Shape#getStyle()
   * @see #getShape()
   * @generated
   */
  EAttribute getShape_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapeConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeConnection
   * @generated
   */
  EClass getShapeConnection();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeConnection#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeConnection#getStyle()
   * @see #getShapeConnection()
   * @generated
   */
  EAttribute getShapeConnection_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDLine <em>CD Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Line</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDLine
   * @generated
   */
  EClass getCDLine();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDLine#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDLine#getLayout()
   * @see #getCDLine()
   * @generated
   */
  EReference getCDLine_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDPolyline <em>CD Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Polyline</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDPolyline
   * @generated
   */
  EClass getCDPolyline();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDPolyline#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDPolyline#getLayout()
   * @see #getCDPolyline()
   * @generated
   */
  EReference getCDPolyline_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDRectangle <em>CD Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDRectangle
   * @generated
   */
  EClass getCDRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDRectangle#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDRectangle#getLayout()
   * @see #getCDRectangle()
   * @generated
   */
  EReference getCDRectangle_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDRoundedRectangle <em>CD Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Rounded Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDRoundedRectangle
   * @generated
   */
  EClass getCDRoundedRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDRoundedRectangle#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDRoundedRectangle#getLayout()
   * @see #getCDRoundedRectangle()
   * @generated
   */
  EReference getCDRoundedRectangle_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDPolygon <em>CD Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Polygon</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDPolygon
   * @generated
   */
  EClass getCDPolygon();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDPolygon#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDPolygon#getLayout()
   * @see #getCDPolygon()
   * @generated
   */
  EReference getCDPolygon_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDEllipse <em>CD Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Ellipse</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDEllipse
   * @generated
   */
  EClass getCDEllipse();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDEllipse#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDEllipse#getLayout()
   * @see #getCDEllipse()
   * @generated
   */
  EReference getCDEllipse_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CDText <em>CD Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CD Text</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDText
   * @generated
   */
  EClass getCDText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CDText#getTexttype <em>Texttype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texttype</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDText#getTexttype()
   * @see #getCDText()
   * @generated
   */
  EAttribute getCDText_Texttype();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDText#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDText#getLayout()
   * @see #getCDText()
   * @generated
   */
  EReference getCDText_Layout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CDText#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CDText#getBody()
   * @see #getCDText()
   * @generated
   */
  EReference getCDText_Body();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Line#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Line#getLayout()
   * @see #getLine()
   * @generated
   */
  EReference getLine_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polyline</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Polyline
   * @generated
   */
  EClass getPolyline();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Polyline#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Polyline#getLayout()
   * @see #getPolyline()
   * @generated
   */
  EReference getPolyline_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Rectangle#getCompartmentInfo <em>Compartment Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compartment Info</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Rectangle#getCompartmentInfo()
   * @see #getRectangle()
   * @generated
   */
  EReference getRectangle_CompartmentInfo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Rectangle#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Rectangle#getLayout()
   * @see #getRectangle()
   * @generated
   */
  EReference getRectangle_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.Rectangle#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Rectangle#getShape()
   * @see #getRectangle()
   * @generated
   */
  EReference getRectangle_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangle <em>Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rounded Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangle
   * @generated
   */
  EClass getRoundedRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangle#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangle#getLayout()
   * @see #getRoundedRectangle()
   * @generated
   */
  EReference getRoundedRectangle_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangle#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangle#getShape()
   * @see #getRoundedRectangle()
   * @generated
   */
  EReference getRoundedRectangle_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polygon</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Polygon
   * @generated
   */
  EClass getPolygon();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Polygon#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Polygon#getLayout()
   * @see #getPolygon()
   * @generated
   */
  EReference getPolygon_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.Polygon#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Polygon#getShape()
   * @see #getPolygon()
   * @generated
   */
  EReference getPolygon_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Ellipse#getCompartmentInfo <em>Compartment Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compartment Info</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Ellipse#getCompartmentInfo()
   * @see #getEllipse()
   * @generated
   */
  EReference getEllipse_CompartmentInfo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Ellipse#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Ellipse#getLayout()
   * @see #getEllipse()
   * @generated
   */
  EReference getEllipse_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.Ellipse#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Ellipse#getShape()
   * @see #getEllipse()
   * @generated
   */
  EReference getEllipse_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Text#getTexttype <em>Texttype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texttype</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Text#getTexttype()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Texttype();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Text#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Text#getLayout()
   * @see #getText()
   * @generated
   */
  EReference getText_Layout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Text#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Text#getBody()
   * @see #getText()
   * @generated
   */
  EReference getText_Body();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo <em>Compartment Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Info</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo
   * @generated
   */
  EClass getCompartmentInfo();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getCompartmentLayout <em>Compartment Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compartment Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getCompartmentLayout()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_CompartmentLayout();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchH <em>Stretch H</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stretch H</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchH()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_StretchH();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchV <em>Stretch V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stretch V</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchV()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_StretchV();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getSpacing <em>Spacing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spacing</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getSpacing()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_Spacing();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getMargin <em>Margin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Margin</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getMargin()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_Margin();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#isInvisible <em>Invisible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Invisible</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#isInvisible()
   * @see #getCompartmentInfo()
   * @generated
   */
  EAttribute getCompartmentInfo_Invisible();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo#getId()
   * @see #getCompartmentInfo()
   * @generated
   */
  EReference getCompartmentInfo_Id();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Compartment <em>Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Compartment
   * @generated
   */
  EClass getCompartment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Compartment#getCompartmentLayout <em>Compartment Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compartment Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Compartment#getCompartmentLayout()
   * @see #getCompartment()
   * @generated
   */
  EAttribute getCompartment_CompartmentLayout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Compartment#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Compartment#getShape()
   * @see #getCompartment()
   * @generated
   */
  EReference getCompartment_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentShape <em>Compartment Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Shape</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentShape
   * @generated
   */
  EClass getCompartmentShape();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentShape#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentShape#getLayout()
   * @see #getCompartmentShape()
   * @generated
   */
  EReference getCompartmentShape_Layout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentShape#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentShape#getId()
   * @see #getCompartmentShape()
   * @generated
   */
  EReference getCompartmentShape_Id();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentRectangle <em>Compartment Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRectangle
   * @generated
   */
  EClass getCompartmentRectangle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle <em>Compartment Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Rounded Rectangle</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle
   * @generated
   */
  EClass getCompartmentRoundedRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle#getLayout()
   * @see #getCompartmentRoundedRectangle()
   * @generated
   */
  EReference getCompartmentRoundedRectangle_Layout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle#getId()
   * @see #getCompartmentRoundedRectangle()
   * @generated
   */
  EReference getCompartmentRoundedRectangle_Id();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentPolygon <em>Compartment Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Polygon</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentPolygon
   * @generated
   */
  EClass getCompartmentPolygon();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentPolygon#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentPolygon#getLayout()
   * @see #getCompartmentPolygon()
   * @generated
   */
  EReference getCompartmentPolygon_Layout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.CompartmentPolygon#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentPolygon#getId()
   * @see #getCompartmentPolygon()
   * @generated
   */
  EReference getCompartmentPolygon_Id();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CompartmentEllipse <em>Compartment Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Ellipse</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentEllipse
   * @generated
   */
  EClass getCompartmentEllipse();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Description#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Description#getStyle()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Style();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Description#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Description#getHAlign()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_HAlign();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Description#getVAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>VAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Description#getVAlign()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_VAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.Description#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Description#getBody()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Body();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout
   * @generated
   */
  EClass getShapeLayout();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getMinwidth <em>Minwidth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minwidth</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getMinwidth()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_Minwidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getMinheight <em>Minheight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minheight</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getMinheight()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_Minheight();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getMaxwidth <em>Maxwidth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxwidth</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getMaxwidth()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_Maxwidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getMaxheight <em>Maxheight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxheight</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getMaxheight()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_Maxheight();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getStretchH <em>Stretch H</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stretch H</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getStretchH()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_StretchH();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getStretchV <em>Stretch V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stretch V</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getStretchV()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_StretchV();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout#getProportional <em>Proportional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proportional</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout#getProportional()
   * @see #getShapeLayout()
   * @generated
   */
  EAttribute getShapeLayout_Proportional();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout <em>Rectangle Ellipse Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle Ellipse Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout
   * @generated
   */
  EClass getRectangleEllipseLayout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout#getCommon <em>Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout#getCommon()
   * @see #getRectangleEllipseLayout()
   * @generated
   */
  EReference getRectangleEllipseLayout_Common();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout#getLayout()
   * @see #getRectangleEllipseLayout()
   * @generated
   */
  EReference getRectangleEllipseLayout_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.LineLayout <em>Line Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.LineLayout
   * @generated
   */
  EClass getLineLayout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.LineLayout#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Point</em>'.
   * @see org.eclipselabs.spray.shapes.shape.LineLayout#getPoint()
   * @see #getLineLayout()
   * @generated
   */
  EReference getLineLayout_Point();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.LineLayout#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.LineLayout#getLayout()
   * @see #getLineLayout()
   * @generated
   */
  EReference getLineLayout_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.PolyLineLayout <em>Poly Line Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poly Line Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PolyLineLayout
   * @generated
   */
  EClass getPolyLineLayout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.shapes.shape.PolyLineLayout#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Point</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PolyLineLayout#getPoint()
   * @see #getPolyLineLayout()
   * @generated
   */
  EReference getPolyLineLayout_Point();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.PolyLineLayout#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.PolyLineLayout#getLayout()
   * @see #getPolyLineLayout()
   * @generated
   */
  EReference getPolyLineLayout_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout <em>Rounded Rectangle Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rounded Rectangle Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout
   * @generated
   */
  EClass getRoundedRectangleLayout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCommon <em>Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCommon()
   * @see #getRoundedRectangleLayout()
   * @generated
   */
  EReference getRoundedRectangleLayout_Common();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCurveWidth <em>Curve Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Curve Width</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCurveWidth()
   * @see #getRoundedRectangleLayout()
   * @generated
   */
  EAttribute getRoundedRectangleLayout_CurveWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCurveHeight <em>Curve Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Curve Height</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getCurveHeight()
   * @see #getRoundedRectangleLayout()
   * @generated
   */
  EAttribute getRoundedRectangleLayout_CurveHeight();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout#getLayout()
   * @see #getRoundedRectangleLayout()
   * @generated
   */
  EReference getRoundedRectangleLayout_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.TextLayout <em>Text Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout
   * @generated
   */
  EClass getTextLayout();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.TextLayout#getCommon <em>Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout#getCommon()
   * @see #getTextLayout()
   * @generated
   */
  EReference getTextLayout_Common();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.TextLayout#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout#getHAlign()
   * @see #getTextLayout()
   * @generated
   */
  EAttribute getTextLayout_HAlign();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.TextLayout#getVAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>VAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout#getVAlign()
   * @see #getTextLayout()
   * @generated
   */
  EAttribute getTextLayout_VAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.shapes.shape.TextLayout#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout#getLayout()
   * @see #getTextLayout()
   * @generated
   */
  EReference getTextLayout_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.ShapestyleLayout <em>Shapestyle Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shapestyle Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ShapestyleLayout
   * @generated
   */
  EClass getShapestyleLayout();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.CommonLayout <em>Common Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout
   * @generated
   */
  EClass getCommonLayout();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CommonLayout#getXcor <em>Xcor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xcor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout#getXcor()
   * @see #getCommonLayout()
   * @generated
   */
  EAttribute getCommonLayout_Xcor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CommonLayout#getYcor <em>Ycor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ycor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout#getYcor()
   * @see #getCommonLayout()
   * @generated
   */
  EAttribute getCommonLayout_Ycor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CommonLayout#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout#getWidth()
   * @see #getCommonLayout()
   * @generated
   */
  EAttribute getCommonLayout_Width();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.CommonLayout#getHeigth <em>Heigth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heigth</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout#getHeigth()
   * @see #getCommonLayout()
   * @generated
   */
  EAttribute getCommonLayout_Heigth();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.TextBody <em>Text Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Body</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextBody
   * @generated
   */
  EClass getTextBody();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.TextBody#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextBody#getValue()
   * @see #getTextBody()
   * @generated
   */
  EAttribute getTextBody_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.shapes.shape.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Point#getXcor <em>Xcor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xcor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Point#getXcor()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Xcor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Point#getYcor <em>Ycor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ycor</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Point#getYcor()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Ycor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Point#getCurveBefore <em>Curve Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Curve Before</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Point#getCurveBefore()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_CurveBefore();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.shapes.shape.Point#getCurveAfter <em>Curve After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Curve After</em>'.
   * @see org.eclipselabs.spray.shapes.shape.Point#getCurveAfter()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_CurveAfter();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.CompartmentLayout <em>Compartment Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compartment Layout</em>'.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentLayout
   * @generated
   */
  EEnum getCompartmentLayout();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.HAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>HAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.HAlign
   * @generated
   */
  EEnum getHAlign();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.VAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>VAlign</em>'.
   * @see org.eclipselabs.spray.shapes.shape.VAlign
   * @generated
   */
  EEnum getVAlign();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.ConnectionStyle <em>Connection Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Connection Style</em>'.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionStyle
   * @generated
   */
  EEnum getConnectionStyle();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Anchor Predefinied Enum</em>'.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum
   * @generated
   */
  EEnum getAnchorPredefiniedEnum();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.shapes.shape.TextType <em>Text Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Text Type</em>'.
   * @see org.eclipselabs.spray.shapes.shape.TextType
   * @generated
   */
  EEnum getTextType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ShapeFactory getShapeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeContainerImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeContainer()
     * @generated
     */
    EClass SHAPE_CONTAINER = eINSTANCE.getShapeContainer();

    /**
     * The meta object literal for the '<em><b>Shape Container Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT = eINSTANCE.getShapeContainer_ShapeContainerElement();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeContainerElementImpl <em>Container Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeContainerElementImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeContainerElement()
     * @generated
     */
    EClass SHAPE_CONTAINER_ELEMENT = eINSTANCE.getShapeContainerElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_CONTAINER_ELEMENT__NAME = eINSTANCE.getShapeContainerElement_Name();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_CONTAINER_ELEMENT__STYLE = eINSTANCE.getShapeContainerElement_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ConnectionDefinitionImpl <em>Connection Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ConnectionDefinitionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getConnectionDefinition()
     * @generated
     */
    EClass CONNECTION_DEFINITION = eINSTANCE.getConnectionDefinition();

    /**
     * The meta object literal for the '<em><b>Connection Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION_DEFINITION__CONNECTION_STYLE = eINSTANCE.getConnectionDefinition_ConnectionStyle();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_DEFINITION__LAYOUT = eINSTANCE.getConnectionDefinition_Layout();

    /**
     * The meta object literal for the '<em><b>Placing</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_DEFINITION__PLACING = eINSTANCE.getConnectionDefinition_Placing();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeDefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeDefinitionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeDefinition()
     * @generated
     */
    EClass SHAPE_DEFINITION = eINSTANCE.getShapeDefinition();

    /**
     * The meta object literal for the '<em><b>Shape Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_DEFINITION__SHAPE_LAYOUT = eINSTANCE.getShapeDefinition_ShapeLayout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_DEFINITION__SHAPE = eINSTANCE.getShapeDefinition_Shape();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_DEFINITION__DESCRIPTION = eINSTANCE.getShapeDefinition_Description();

    /**
     * The meta object literal for the '<em><b>Anchor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_DEFINITION__ANCHOR = eINSTANCE.getShapeDefinition_Anchor();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.PlacingDefinitionImpl <em>Placing Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.PlacingDefinitionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPlacingDefinition()
     * @generated
     */
    EClass PLACING_DEFINITION = eINSTANCE.getPlacingDefinition();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACING_DEFINITION__OFFSET = eINSTANCE.getPlacingDefinition_Offset();

    /**
     * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACING_DEFINITION__DISTANCE = eINSTANCE.getPlacingDefinition_Distance();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACING_DEFINITION__ANGLE = eINSTANCE.getPlacingDefinition_Angle();

    /**
     * The meta object literal for the '<em><b>Shape Con</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACING_DEFINITION__SHAPE_CON = eINSTANCE.getPlacingDefinition_ShapeCon();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorImpl <em>Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchor()
     * @generated
     */
    EClass ANCHOR = eINSTANCE.getAnchor();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR__TYPE = eINSTANCE.getAnchor_Type();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorTypeImpl <em>Anchor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorTypeImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorType()
     * @generated
     */
    EClass ANCHOR_TYPE = eINSTANCE.getAnchorType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPredefiniedImpl <em>Anchor Predefinied</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPredefiniedImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPredefinied()
     * @generated
     */
    EClass ANCHOR_PREDEFINIED = eINSTANCE.getAnchorPredefinied();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_PREDEFINIED__VALUE = eINSTANCE.getAnchorPredefinied_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorManualImpl <em>Anchor Manual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorManualImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorManual()
     * @generated
     */
    EClass ANCHOR_MANUAL = eINSTANCE.getAnchorManual();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR_MANUAL__POSITION = eINSTANCE.getAnchorManual_Position();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPositionImpl <em>Anchor Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPositionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPosition()
     * @generated
     */
    EClass ANCHOR_POSITION = eINSTANCE.getAnchorPosition();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR_POSITION__POS = eINSTANCE.getAnchorPosition_Pos();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorPositionPosImpl <em>Anchor Position Pos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorPositionPosImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPositionPos()
     * @generated
     */
    EClass ANCHOR_POSITION_POS = eINSTANCE.getAnchorPositionPos();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorRelativePositionImpl <em>Anchor Relative Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorRelativePositionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorRelativePosition()
     * @generated
     */
    EClass ANCHOR_RELATIVE_POSITION = eINSTANCE.getAnchorRelativePosition();

    /**
     * The meta object literal for the '<em><b>Xoffset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_RELATIVE_POSITION__XOFFSET = eINSTANCE.getAnchorRelativePosition_Xoffset();

    /**
     * The meta object literal for the '<em><b>Yoffset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_RELATIVE_POSITION__YOFFSET = eINSTANCE.getAnchorRelativePosition_Yoffset();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.AnchorFixPointPositionImpl <em>Anchor Fix Point Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.AnchorFixPointPositionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorFixPointPosition()
     * @generated
     */
    EClass ANCHOR_FIX_POINT_POSITION = eINSTANCE.getAnchorFixPointPosition();

    /**
     * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_FIX_POINT_POSITION__XCOR = eINSTANCE.getAnchorFixPointPosition_Xcor();

    /**
     * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANCHOR_FIX_POINT_POSITION__YCOR = eINSTANCE.getAnchorFixPointPosition_Ycor();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShape()
     * @generated
     */
    EClass SHAPE = eINSTANCE.getShape();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE__STYLE = eINSTANCE.getShape_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeConnectionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeConnection()
     * @generated
     */
    EClass SHAPE_CONNECTION = eINSTANCE.getShapeConnection();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_CONNECTION__STYLE = eINSTANCE.getShapeConnection_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDLineImpl <em>CD Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDLineImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDLine()
     * @generated
     */
    EClass CD_LINE = eINSTANCE.getCDLine();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_LINE__LAYOUT = eINSTANCE.getCDLine_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDPolylineImpl <em>CD Polyline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDPolylineImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDPolyline()
     * @generated
     */
    EClass CD_POLYLINE = eINSTANCE.getCDPolyline();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_POLYLINE__LAYOUT = eINSTANCE.getCDPolyline_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDRectangleImpl <em>CD Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDRectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDRectangle()
     * @generated
     */
    EClass CD_RECTANGLE = eINSTANCE.getCDRectangle();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_RECTANGLE__LAYOUT = eINSTANCE.getCDRectangle_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDRoundedRectangleImpl <em>CD Rounded Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDRoundedRectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDRoundedRectangle()
     * @generated
     */
    EClass CD_ROUNDED_RECTANGLE = eINSTANCE.getCDRoundedRectangle();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getCDRoundedRectangle_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDPolygonImpl <em>CD Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDPolygonImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDPolygon()
     * @generated
     */
    EClass CD_POLYGON = eINSTANCE.getCDPolygon();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_POLYGON__LAYOUT = eINSTANCE.getCDPolygon_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDEllipseImpl <em>CD Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDEllipseImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDEllipse()
     * @generated
     */
    EClass CD_ELLIPSE = eINSTANCE.getCDEllipse();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_ELLIPSE__LAYOUT = eINSTANCE.getCDEllipse_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CDTextImpl <em>CD Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CDTextImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCDText()
     * @generated
     */
    EClass CD_TEXT = eINSTANCE.getCDText();

    /**
     * The meta object literal for the '<em><b>Texttype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CD_TEXT__TEXTTYPE = eINSTANCE.getCDText_Texttype();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_TEXT__LAYOUT = eINSTANCE.getCDText_Layout();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CD_TEXT__BODY = eINSTANCE.getCDText_Body();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.LineImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE__LAYOUT = eINSTANCE.getLine_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolylineImpl <em>Polyline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.PolylineImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolyline()
     * @generated
     */
    EClass POLYLINE = eINSTANCE.getPolyline();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLYLINE__LAYOUT = eINSTANCE.getPolyline_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.RectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRectangle()
     * @generated
     */
    EClass RECTANGLE = eINSTANCE.getRectangle();

    /**
     * The meta object literal for the '<em><b>Compartment Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE__COMPARTMENT_INFO = eINSTANCE.getRectangle_CompartmentInfo();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE__LAYOUT = eINSTANCE.getRectangle_Layout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE__SHAPE = eINSTANCE.getRectangle_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRoundedRectangle()
     * @generated
     */
    EClass ROUNDED_RECTANGLE = eINSTANCE.getRoundedRectangle();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getRoundedRectangle_Layout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUNDED_RECTANGLE__SHAPE = eINSTANCE.getRoundedRectangle_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolygonImpl <em>Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.PolygonImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolygon()
     * @generated
     */
    EClass POLYGON = eINSTANCE.getPolygon();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLYGON__LAYOUT = eINSTANCE.getPolygon_Layout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLYGON__SHAPE = eINSTANCE.getPolygon_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.EllipseImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getEllipse()
     * @generated
     */
    EClass ELLIPSE = eINSTANCE.getEllipse();

    /**
     * The meta object literal for the '<em><b>Compartment Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPSE__COMPARTMENT_INFO = eINSTANCE.getEllipse_CompartmentInfo();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPSE__LAYOUT = eINSTANCE.getEllipse_Layout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPSE__SHAPE = eINSTANCE.getEllipse_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.TextImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Texttype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXTTYPE = eINSTANCE.getText_Texttype();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT__LAYOUT = eINSTANCE.getText_Layout();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT__BODY = eINSTANCE.getText_Body();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentInfoImpl <em>Compartment Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentInfoImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentInfo()
     * @generated
     */
    EClass COMPARTMENT_INFO = eINSTANCE.getCompartmentInfo();

    /**
     * The meta object literal for the '<em><b>Compartment Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__COMPARTMENT_LAYOUT = eINSTANCE.getCompartmentInfo_CompartmentLayout();

    /**
     * The meta object literal for the '<em><b>Stretch H</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__STRETCH_H = eINSTANCE.getCompartmentInfo_StretchH();

    /**
     * The meta object literal for the '<em><b>Stretch V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__STRETCH_V = eINSTANCE.getCompartmentInfo_StretchV();

    /**
     * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__SPACING = eINSTANCE.getCompartmentInfo_Spacing();

    /**
     * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__MARGIN = eINSTANCE.getCompartmentInfo_Margin();

    /**
     * The meta object literal for the '<em><b>Invisible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_INFO__INVISIBLE = eINSTANCE.getCompartmentInfo_Invisible();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_INFO__ID = eINSTANCE.getCompartmentInfo_Id();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentImpl <em>Compartment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartment()
     * @generated
     */
    EClass COMPARTMENT = eINSTANCE.getCompartment();

    /**
     * The meta object literal for the '<em><b>Compartment Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT__COMPARTMENT_LAYOUT = eINSTANCE.getCompartment_CompartmentLayout();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT__SHAPE = eINSTANCE.getCompartment_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentShapeImpl <em>Compartment Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentShapeImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentShape()
     * @generated
     */
    EClass COMPARTMENT_SHAPE = eINSTANCE.getCompartmentShape();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_SHAPE__LAYOUT = eINSTANCE.getCompartmentShape_Layout();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_SHAPE__ID = eINSTANCE.getCompartmentShape_Id();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentRectangleImpl <em>Compartment Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentRectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentRectangle()
     * @generated
     */
    EClass COMPARTMENT_RECTANGLE = eINSTANCE.getCompartmentRectangle();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentRoundedRectangleImpl <em>Compartment Rounded Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentRoundedRectangleImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentRoundedRectangle()
     * @generated
     */
    EClass COMPARTMENT_ROUNDED_RECTANGLE = eINSTANCE.getCompartmentRoundedRectangle();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT = eINSTANCE.getCompartmentRoundedRectangle_Layout();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_ROUNDED_RECTANGLE__ID = eINSTANCE.getCompartmentRoundedRectangle_Id();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentPolygonImpl <em>Compartment Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentPolygonImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentPolygon()
     * @generated
     */
    EClass COMPARTMENT_POLYGON = eINSTANCE.getCompartmentPolygon();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_POLYGON__LAYOUT = eINSTANCE.getCompartmentPolygon_Layout();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_POLYGON__ID = eINSTANCE.getCompartmentPolygon_Id();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CompartmentEllipseImpl <em>Compartment Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CompartmentEllipseImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentEllipse()
     * @generated
     */
    EClass COMPARTMENT_ELLIPSE = eINSTANCE.getCompartmentEllipse();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__STYLE = eINSTANCE.getDescription_Style();

    /**
     * The meta object literal for the '<em><b>HAlign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__HALIGN = eINSTANCE.getDescription_HAlign();

    /**
     * The meta object literal for the '<em><b>VAlign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__VALIGN = eINSTANCE.getDescription_VAlign();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__BODY = eINSTANCE.getDescription_Body();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapeLayout()
     * @generated
     */
    EClass SHAPE_LAYOUT = eINSTANCE.getShapeLayout();

    /**
     * The meta object literal for the '<em><b>Minwidth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__MINWIDTH = eINSTANCE.getShapeLayout_Minwidth();

    /**
     * The meta object literal for the '<em><b>Minheight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__MINHEIGHT = eINSTANCE.getShapeLayout_Minheight();

    /**
     * The meta object literal for the '<em><b>Maxwidth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__MAXWIDTH = eINSTANCE.getShapeLayout_Maxwidth();

    /**
     * The meta object literal for the '<em><b>Maxheight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__MAXHEIGHT = eINSTANCE.getShapeLayout_Maxheight();

    /**
     * The meta object literal for the '<em><b>Stretch H</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__STRETCH_H = eINSTANCE.getShapeLayout_StretchH();

    /**
     * The meta object literal for the '<em><b>Stretch V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__STRETCH_V = eINSTANCE.getShapeLayout_StretchV();

    /**
     * The meta object literal for the '<em><b>Proportional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_LAYOUT__PROPORTIONAL = eINSTANCE.getShapeLayout_Proportional();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.RectangleEllipseLayoutImpl <em>Rectangle Ellipse Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.RectangleEllipseLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRectangleEllipseLayout()
     * @generated
     */
    EClass RECTANGLE_ELLIPSE_LAYOUT = eINSTANCE.getRectangleEllipseLayout();

    /**
     * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE_ELLIPSE_LAYOUT__COMMON = eINSTANCE.getRectangleEllipseLayout_Common();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE_ELLIPSE_LAYOUT__LAYOUT = eINSTANCE.getRectangleEllipseLayout_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.LineLayoutImpl <em>Line Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.LineLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getLineLayout()
     * @generated
     */
    EClass LINE_LAYOUT = eINSTANCE.getLineLayout();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE_LAYOUT__POINT = eINSTANCE.getLineLayout_Point();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE_LAYOUT__LAYOUT = eINSTANCE.getLineLayout_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.PolyLineLayoutImpl <em>Poly Line Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.PolyLineLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPolyLineLayout()
     * @generated
     */
    EClass POLY_LINE_LAYOUT = eINSTANCE.getPolyLineLayout();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLY_LINE_LAYOUT__POINT = eINSTANCE.getPolyLineLayout_Point();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLY_LINE_LAYOUT__LAYOUT = eINSTANCE.getPolyLineLayout_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleLayoutImpl <em>Rounded Rectangle Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.RoundedRectangleLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getRoundedRectangleLayout()
     * @generated
     */
    EClass ROUNDED_RECTANGLE_LAYOUT = eINSTANCE.getRoundedRectangleLayout();

    /**
     * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUNDED_RECTANGLE_LAYOUT__COMMON = eINSTANCE.getRoundedRectangleLayout_Common();

    /**
     * The meta object literal for the '<em><b>Curve Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH = eINSTANCE.getRoundedRectangleLayout_CurveWidth();

    /**
     * The meta object literal for the '<em><b>Curve Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT = eINSTANCE.getRoundedRectangleLayout_CurveHeight();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUNDED_RECTANGLE_LAYOUT__LAYOUT = eINSTANCE.getRoundedRectangleLayout_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextLayoutImpl <em>Text Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.TextLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextLayout()
     * @generated
     */
    EClass TEXT_LAYOUT = eINSTANCE.getTextLayout();

    /**
     * The meta object literal for the '<em><b>Common</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_LAYOUT__COMMON = eINSTANCE.getTextLayout_Common();

    /**
     * The meta object literal for the '<em><b>HAlign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_LAYOUT__HALIGN = eINSTANCE.getTextLayout_HAlign();

    /**
     * The meta object literal for the '<em><b>VAlign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_LAYOUT__VALIGN = eINSTANCE.getTextLayout_VAlign();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_LAYOUT__LAYOUT = eINSTANCE.getTextLayout_Layout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.ShapestyleLayoutImpl <em>Shapestyle Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapestyleLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getShapestyleLayout()
     * @generated
     */
    EClass SHAPESTYLE_LAYOUT = eINSTANCE.getShapestyleLayout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.CommonLayoutImpl <em>Common Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.CommonLayoutImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCommonLayout()
     * @generated
     */
    EClass COMMON_LAYOUT = eINSTANCE.getCommonLayout();

    /**
     * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_LAYOUT__XCOR = eINSTANCE.getCommonLayout_Xcor();

    /**
     * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_LAYOUT__YCOR = eINSTANCE.getCommonLayout_Ycor();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_LAYOUT__WIDTH = eINSTANCE.getCommonLayout_Width();

    /**
     * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_LAYOUT__HEIGTH = eINSTANCE.getCommonLayout_Heigth();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.TextBodyImpl <em>Text Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.TextBodyImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextBody()
     * @generated
     */
    EClass TEXT_BODY = eINSTANCE.getTextBody();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_BODY__VALUE = eINSTANCE.getTextBody_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.impl.PointImpl
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>Xcor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__XCOR = eINSTANCE.getPoint_Xcor();

    /**
     * The meta object literal for the '<em><b>Ycor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__YCOR = eINSTANCE.getPoint_Ycor();

    /**
     * The meta object literal for the '<em><b>Curve Before</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__CURVE_BEFORE = eINSTANCE.getPoint_CurveBefore();

    /**
     * The meta object literal for the '<em><b>Curve After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__CURVE_AFTER = eINSTANCE.getPoint_CurveAfter();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.CompartmentLayout <em>Compartment Layout</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.CompartmentLayout
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getCompartmentLayout()
     * @generated
     */
    EEnum COMPARTMENT_LAYOUT = eINSTANCE.getCompartmentLayout();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.HAlign <em>HAlign</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.HAlign
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getHAlign()
     * @generated
     */
    EEnum HALIGN = eINSTANCE.getHAlign();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.VAlign <em>VAlign</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.VAlign
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getVAlign()
     * @generated
     */
    EEnum VALIGN = eINSTANCE.getVAlign();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.ConnectionStyle <em>Connection Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.ConnectionStyle
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getConnectionStyle()
     * @generated
     */
    EEnum CONNECTION_STYLE = eINSTANCE.getConnectionStyle();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum <em>Anchor Predefinied Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getAnchorPredefiniedEnum()
     * @generated
     */
    EEnum ANCHOR_PREDEFINIED_ENUM = eINSTANCE.getAnchorPredefiniedEnum();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.shapes.shape.TextType <em>Text Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.shapes.shape.TextType
     * @see org.eclipselabs.spray.shapes.shape.impl.ShapePackageImpl#getTextType()
     * @generated
     */
    EEnum TEXT_TYPE = eINSTANCE.getTextType();

  }

} //ShapePackage
