/**
 */
package org.eclipselabs.spray.shapes.shape.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray.shapes.shape.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeFactoryImpl extends EFactoryImpl implements ShapeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ShapeFactory init()
  {
    try
    {
      ShapeFactory theShapeFactory = (ShapeFactory)EPackage.Registry.INSTANCE.getEFactory(ShapePackage.eNS_URI);
      if (theShapeFactory != null)
      {
        return theShapeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ShapeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ShapePackage.SHAPE_CONTAINER: return createShapeContainer();
      case ShapePackage.SHAPE_CONTAINER_ELEMENT: return createShapeContainerElement();
      case ShapePackage.CONNECTION_DEFINITION: return createConnectionDefinition();
      case ShapePackage.SHAPE_DEFINITION: return createShapeDefinition();
      case ShapePackage.PLACING_DEFINITION: return createPlacingDefinition();
      case ShapePackage.ANCHOR: return createAnchor();
      case ShapePackage.ANCHOR_TYPE: return createAnchorType();
      case ShapePackage.ANCHOR_PREDEFINIED: return createAnchorPredefinied();
      case ShapePackage.ANCHOR_MANUAL: return createAnchorManual();
      case ShapePackage.ANCHOR_POSITION: return createAnchorPosition();
      case ShapePackage.ANCHOR_POSITION_POS: return createAnchorPositionPos();
      case ShapePackage.ANCHOR_RELATIVE_POSITION: return createAnchorRelativePosition();
      case ShapePackage.ANCHOR_FIX_POINT_POSITION: return createAnchorFixPointPosition();
      case ShapePackage.SHAPE: return createShape();
      case ShapePackage.SHAPE_CONNECTION: return createShapeConnection();
      case ShapePackage.CD_LINE: return createCDLine();
      case ShapePackage.CD_POLYLINE: return createCDPolyline();
      case ShapePackage.CD_RECTANGLE: return createCDRectangle();
      case ShapePackage.CD_ROUNDED_RECTANGLE: return createCDRoundedRectangle();
      case ShapePackage.CD_POLYGON: return createCDPolygon();
      case ShapePackage.CD_ELLIPSE: return createCDEllipse();
      case ShapePackage.CD_TEXT: return createCDText();
      case ShapePackage.LINE: return createLine();
      case ShapePackage.POLYLINE: return createPolyline();
      case ShapePackage.RECTANGLE: return createRectangle();
      case ShapePackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
      case ShapePackage.POLYGON: return createPolygon();
      case ShapePackage.ELLIPSE: return createEllipse();
      case ShapePackage.TEXT: return createText();
      case ShapePackage.COMPARTMENT_INFO: return createCompartmentInfo();
      case ShapePackage.COMPARTMENT: return createCompartment();
      case ShapePackage.COMPARTMENT_SHAPE: return createCompartmentShape();
      case ShapePackage.COMPARTMENT_RECTANGLE: return createCompartmentRectangle();
      case ShapePackage.COMPARTMENT_ROUNDED_RECTANGLE: return createCompartmentRoundedRectangle();
      case ShapePackage.COMPARTMENT_POLYGON: return createCompartmentPolygon();
      case ShapePackage.COMPARTMENT_ELLIPSE: return createCompartmentEllipse();
      case ShapePackage.DESCRIPTION: return createDescription();
      case ShapePackage.SHAPE_LAYOUT: return createShapeLayout();
      case ShapePackage.RECTANGLE_ELLIPSE_LAYOUT: return createRectangleEllipseLayout();
      case ShapePackage.LINE_LAYOUT: return createLineLayout();
      case ShapePackage.POLY_LINE_LAYOUT: return createPolyLineLayout();
      case ShapePackage.ROUNDED_RECTANGLE_LAYOUT: return createRoundedRectangleLayout();
      case ShapePackage.TEXT_LAYOUT: return createTextLayout();
      case ShapePackage.SHAPESTYLE_LAYOUT: return createShapestyleLayout();
      case ShapePackage.COMMON_LAYOUT: return createCommonLayout();
      case ShapePackage.TEXT_BODY: return createTextBody();
      case ShapePackage.POINT: return createPoint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ShapePackage.COMPARTMENT_LAYOUT:
        return createCompartmentLayoutFromString(eDataType, initialValue);
      case ShapePackage.HALIGN:
        return createHAlignFromString(eDataType, initialValue);
      case ShapePackage.VALIGN:
        return createVAlignFromString(eDataType, initialValue);
      case ShapePackage.CONNECTION_STYLE:
        return createConnectionStyleFromString(eDataType, initialValue);
      case ShapePackage.ANCHOR_PREDEFINIED_ENUM:
        return createAnchorPredefiniedEnumFromString(eDataType, initialValue);
      case ShapePackage.TEXT_TYPE:
        return createTextTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ShapePackage.COMPARTMENT_LAYOUT:
        return convertCompartmentLayoutToString(eDataType, instanceValue);
      case ShapePackage.HALIGN:
        return convertHAlignToString(eDataType, instanceValue);
      case ShapePackage.VALIGN:
        return convertVAlignToString(eDataType, instanceValue);
      case ShapePackage.CONNECTION_STYLE:
        return convertConnectionStyleToString(eDataType, instanceValue);
      case ShapePackage.ANCHOR_PREDEFINIED_ENUM:
        return convertAnchorPredefiniedEnumToString(eDataType, instanceValue);
      case ShapePackage.TEXT_TYPE:
        return convertTextTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeContainer createShapeContainer()
  {
    ShapeContainerImpl shapeContainer = new ShapeContainerImpl();
    return shapeContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeContainerElement createShapeContainerElement()
  {
    ShapeContainerElementImpl shapeContainerElement = new ShapeContainerElementImpl();
    return shapeContainerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionDefinition createConnectionDefinition()
  {
    ConnectionDefinitionImpl connectionDefinition = new ConnectionDefinitionImpl();
    return connectionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeDefinition createShapeDefinition()
  {
    ShapeDefinitionImpl shapeDefinition = new ShapeDefinitionImpl();
    return shapeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlacingDefinition createPlacingDefinition()
  {
    PlacingDefinitionImpl placingDefinition = new PlacingDefinitionImpl();
    return placingDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anchor createAnchor()
  {
    AnchorImpl anchor = new AnchorImpl();
    return anchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorType createAnchorType()
  {
    AnchorTypeImpl anchorType = new AnchorTypeImpl();
    return anchorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorPredefinied createAnchorPredefinied()
  {
    AnchorPredefiniedImpl anchorPredefinied = new AnchorPredefiniedImpl();
    return anchorPredefinied;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorManual createAnchorManual()
  {
    AnchorManualImpl anchorManual = new AnchorManualImpl();
    return anchorManual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorPosition createAnchorPosition()
  {
    AnchorPositionImpl anchorPosition = new AnchorPositionImpl();
    return anchorPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorPositionPos createAnchorPositionPos()
  {
    AnchorPositionPosImpl anchorPositionPos = new AnchorPositionPosImpl();
    return anchorPositionPos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorRelativePosition createAnchorRelativePosition()
  {
    AnchorRelativePositionImpl anchorRelativePosition = new AnchorRelativePositionImpl();
    return anchorRelativePosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorFixPointPosition createAnchorFixPointPosition()
  {
    AnchorFixPointPositionImpl anchorFixPointPosition = new AnchorFixPointPositionImpl();
    return anchorFixPointPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape createShape()
  {
    ShapeImpl shape = new ShapeImpl();
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeConnection createShapeConnection()
  {
    ShapeConnectionImpl shapeConnection = new ShapeConnectionImpl();
    return shapeConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDLine createCDLine()
  {
    CDLineImpl cdLine = new CDLineImpl();
    return cdLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDPolyline createCDPolyline()
  {
    CDPolylineImpl cdPolyline = new CDPolylineImpl();
    return cdPolyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDRectangle createCDRectangle()
  {
    CDRectangleImpl cdRectangle = new CDRectangleImpl();
    return cdRectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDRoundedRectangle createCDRoundedRectangle()
  {
    CDRoundedRectangleImpl cdRoundedRectangle = new CDRoundedRectangleImpl();
    return cdRoundedRectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDPolygon createCDPolygon()
  {
    CDPolygonImpl cdPolygon = new CDPolygonImpl();
    return cdPolygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDEllipse createCDEllipse()
  {
    CDEllipseImpl cdEllipse = new CDEllipseImpl();
    return cdEllipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDText createCDText()
  {
    CDTextImpl cdText = new CDTextImpl();
    return cdText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polyline createPolyline()
  {
    PolylineImpl polyline = new PolylineImpl();
    return polyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle createRectangle()
  {
    RectangleImpl rectangle = new RectangleImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoundedRectangle createRoundedRectangle()
  {
    RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
    return roundedRectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polygon createPolygon()
  {
    PolygonImpl polygon = new PolygonImpl();
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ellipse createEllipse()
  {
    EllipseImpl ellipse = new EllipseImpl();
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentInfo createCompartmentInfo()
  {
    CompartmentInfoImpl compartmentInfo = new CompartmentInfoImpl();
    return compartmentInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compartment createCompartment()
  {
    CompartmentImpl compartment = new CompartmentImpl();
    return compartment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentShape createCompartmentShape()
  {
    CompartmentShapeImpl compartmentShape = new CompartmentShapeImpl();
    return compartmentShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentRectangle createCompartmentRectangle()
  {
    CompartmentRectangleImpl compartmentRectangle = new CompartmentRectangleImpl();
    return compartmentRectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentRoundedRectangle createCompartmentRoundedRectangle()
  {
    CompartmentRoundedRectangleImpl compartmentRoundedRectangle = new CompartmentRoundedRectangleImpl();
    return compartmentRoundedRectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentPolygon createCompartmentPolygon()
  {
    CompartmentPolygonImpl compartmentPolygon = new CompartmentPolygonImpl();
    return compartmentPolygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentEllipse createCompartmentEllipse()
  {
    CompartmentEllipseImpl compartmentEllipse = new CompartmentEllipseImpl();
    return compartmentEllipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeLayout createShapeLayout()
  {
    ShapeLayoutImpl shapeLayout = new ShapeLayoutImpl();
    return shapeLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RectangleEllipseLayout createRectangleEllipseLayout()
  {
    RectangleEllipseLayoutImpl rectangleEllipseLayout = new RectangleEllipseLayoutImpl();
    return rectangleEllipseLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineLayout createLineLayout()
  {
    LineLayoutImpl lineLayout = new LineLayoutImpl();
    return lineLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolyLineLayout createPolyLineLayout()
  {
    PolyLineLayoutImpl polyLineLayout = new PolyLineLayoutImpl();
    return polyLineLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoundedRectangleLayout createRoundedRectangleLayout()
  {
    RoundedRectangleLayoutImpl roundedRectangleLayout = new RoundedRectangleLayoutImpl();
    return roundedRectangleLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextLayout createTextLayout()
  {
    TextLayoutImpl textLayout = new TextLayoutImpl();
    return textLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapestyleLayout createShapestyleLayout()
  {
    ShapestyleLayoutImpl shapestyleLayout = new ShapestyleLayoutImpl();
    return shapestyleLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonLayout createCommonLayout()
  {
    CommonLayoutImpl commonLayout = new CommonLayoutImpl();
    return commonLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextBody createTextBody()
  {
    TextBodyImpl textBody = new TextBodyImpl();
    return textBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentLayout createCompartmentLayoutFromString(EDataType eDataType, String initialValue)
  {
    CompartmentLayout result = CompartmentLayout.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompartmentLayoutToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HAlign createHAlignFromString(EDataType eDataType, String initialValue)
  {
    HAlign result = HAlign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHAlignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlign createVAlignFromString(EDataType eDataType, String initialValue)
  {
    VAlign result = VAlign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVAlignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionStyle createConnectionStyleFromString(EDataType eDataType, String initialValue)
  {
    ConnectionStyle result = ConnectionStyle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConnectionStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorPredefiniedEnum createAnchorPredefiniedEnumFromString(EDataType eDataType, String initialValue)
  {
    AnchorPredefiniedEnum result = AnchorPredefiniedEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAnchorPredefiniedEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextType createTextTypeFromString(EDataType eDataType, String initialValue)
  {
    TextType result = TextType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTextTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapePackage getShapePackage()
  {
    return (ShapePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ShapePackage getPackage()
  {
    return ShapePackage.eINSTANCE;
  }

} //ShapeFactoryImpl
