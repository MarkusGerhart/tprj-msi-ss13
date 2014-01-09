/**
 */
package org.eclipselabs.spray.shapes.shape.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.spray.shapes.shape.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.shape.ShapePackage
 * @generated
 */
public class ShapeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ShapePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ShapePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeSwitch<Adapter> modelSwitch =
    new ShapeSwitch<Adapter>()
    {
      @Override
      public Adapter caseShapeContainer(ShapeContainer object)
      {
        return createShapeContainerAdapter();
      }
      @Override
      public Adapter caseShapeContainerElement(ShapeContainerElement object)
      {
        return createShapeContainerElementAdapter();
      }
      @Override
      public Adapter caseConnectionDefinition(ConnectionDefinition object)
      {
        return createConnectionDefinitionAdapter();
      }
      @Override
      public Adapter caseShapeDefinition(ShapeDefinition object)
      {
        return createShapeDefinitionAdapter();
      }
      @Override
      public Adapter casePlacingDefinition(PlacingDefinition object)
      {
        return createPlacingDefinitionAdapter();
      }
      @Override
      public Adapter caseAnchor(Anchor object)
      {
        return createAnchorAdapter();
      }
      @Override
      public Adapter caseAnchorType(AnchorType object)
      {
        return createAnchorTypeAdapter();
      }
      @Override
      public Adapter caseAnchorPredefinied(AnchorPredefinied object)
      {
        return createAnchorPredefiniedAdapter();
      }
      @Override
      public Adapter caseAnchorManual(AnchorManual object)
      {
        return createAnchorManualAdapter();
      }
      @Override
      public Adapter caseAnchorPosition(AnchorPosition object)
      {
        return createAnchorPositionAdapter();
      }
      @Override
      public Adapter caseAnchorPositionPos(AnchorPositionPos object)
      {
        return createAnchorPositionPosAdapter();
      }
      @Override
      public Adapter caseAnchorRelativePosition(AnchorRelativePosition object)
      {
        return createAnchorRelativePositionAdapter();
      }
      @Override
      public Adapter caseAnchorFixPointPosition(AnchorFixPointPosition object)
      {
        return createAnchorFixPointPositionAdapter();
      }
      @Override
      public Adapter caseShape(Shape object)
      {
        return createShapeAdapter();
      }
      @Override
      public Adapter caseShapeConnection(ShapeConnection object)
      {
        return createShapeConnectionAdapter();
      }
      @Override
      public Adapter caseCDLine(CDLine object)
      {
        return createCDLineAdapter();
      }
      @Override
      public Adapter caseCDPolyline(CDPolyline object)
      {
        return createCDPolylineAdapter();
      }
      @Override
      public Adapter caseCDRectangle(CDRectangle object)
      {
        return createCDRectangleAdapter();
      }
      @Override
      public Adapter caseCDRoundedRectangle(CDRoundedRectangle object)
      {
        return createCDRoundedRectangleAdapter();
      }
      @Override
      public Adapter caseCDPolygon(CDPolygon object)
      {
        return createCDPolygonAdapter();
      }
      @Override
      public Adapter caseCDEllipse(CDEllipse object)
      {
        return createCDEllipseAdapter();
      }
      @Override
      public Adapter caseCDText(CDText object)
      {
        return createCDTextAdapter();
      }
      @Override
      public Adapter caseLine(Line object)
      {
        return createLineAdapter();
      }
      @Override
      public Adapter casePolyline(Polyline object)
      {
        return createPolylineAdapter();
      }
      @Override
      public Adapter caseRectangle(Rectangle object)
      {
        return createRectangleAdapter();
      }
      @Override
      public Adapter caseRoundedRectangle(RoundedRectangle object)
      {
        return createRoundedRectangleAdapter();
      }
      @Override
      public Adapter casePolygon(Polygon object)
      {
        return createPolygonAdapter();
      }
      @Override
      public Adapter caseEllipse(Ellipse object)
      {
        return createEllipseAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseCompartmentInfo(CompartmentInfo object)
      {
        return createCompartmentInfoAdapter();
      }
      @Override
      public Adapter caseCompartment(Compartment object)
      {
        return createCompartmentAdapter();
      }
      @Override
      public Adapter caseCompartmentShape(CompartmentShape object)
      {
        return createCompartmentShapeAdapter();
      }
      @Override
      public Adapter caseCompartmentRectangle(CompartmentRectangle object)
      {
        return createCompartmentRectangleAdapter();
      }
      @Override
      public Adapter caseCompartmentRoundedRectangle(CompartmentRoundedRectangle object)
      {
        return createCompartmentRoundedRectangleAdapter();
      }
      @Override
      public Adapter caseCompartmentPolygon(CompartmentPolygon object)
      {
        return createCompartmentPolygonAdapter();
      }
      @Override
      public Adapter caseCompartmentEllipse(CompartmentEllipse object)
      {
        return createCompartmentEllipseAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseShapeLayout(ShapeLayout object)
      {
        return createShapeLayoutAdapter();
      }
      @Override
      public Adapter caseRectangleEllipseLayout(RectangleEllipseLayout object)
      {
        return createRectangleEllipseLayoutAdapter();
      }
      @Override
      public Adapter caseLineLayout(LineLayout object)
      {
        return createLineLayoutAdapter();
      }
      @Override
      public Adapter casePolyLineLayout(PolyLineLayout object)
      {
        return createPolyLineLayoutAdapter();
      }
      @Override
      public Adapter caseRoundedRectangleLayout(RoundedRectangleLayout object)
      {
        return createRoundedRectangleLayoutAdapter();
      }
      @Override
      public Adapter caseTextLayout(TextLayout object)
      {
        return createTextLayoutAdapter();
      }
      @Override
      public Adapter caseShapestyleLayout(ShapestyleLayout object)
      {
        return createShapestyleLayoutAdapter();
      }
      @Override
      public Adapter caseCommonLayout(CommonLayout object)
      {
        return createCommonLayoutAdapter();
      }
      @Override
      public Adapter caseTextBody(TextBody object)
      {
        return createTextBodyAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapeContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainer
   * @generated
   */
  public Adapter createShapeContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapeContainerElement <em>Container Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapeContainerElement
   * @generated
   */
  public Adapter createShapeContainerElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ConnectionDefinition <em>Connection Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ConnectionDefinition
   * @generated
   */
  public Adapter createConnectionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapeDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapeDefinition
   * @generated
   */
  public Adapter createShapeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.PlacingDefinition <em>Placing Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.PlacingDefinition
   * @generated
   */
  public Adapter createPlacingDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Anchor
   * @generated
   */
  public Adapter createAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorType <em>Anchor Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorType
   * @generated
   */
  public Adapter createAnchorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefinied <em>Anchor Predefinied</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefinied
   * @generated
   */
  public Adapter createAnchorPredefiniedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorManual <em>Anchor Manual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorManual
   * @generated
   */
  public Adapter createAnchorManualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorPosition <em>Anchor Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPosition
   * @generated
   */
  public Adapter createAnchorPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorPositionPos <em>Anchor Position Pos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPositionPos
   * @generated
   */
  public Adapter createAnchorPositionPosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorRelativePosition <em>Anchor Relative Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorRelativePosition
   * @generated
   */
  public Adapter createAnchorRelativePositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition <em>Anchor Fix Point Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition
   * @generated
   */
  public Adapter createAnchorFixPointPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Shape
   * @generated
   */
  public Adapter createShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapeConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapeConnection
   * @generated
   */
  public Adapter createShapeConnectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDLine <em>CD Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDLine
   * @generated
   */
  public Adapter createCDLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDPolyline <em>CD Polyline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDPolyline
   * @generated
   */
  public Adapter createCDPolylineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDRectangle <em>CD Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDRectangle
   * @generated
   */
  public Adapter createCDRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDRoundedRectangle <em>CD Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDRoundedRectangle
   * @generated
   */
  public Adapter createCDRoundedRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDPolygon <em>CD Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDPolygon
   * @generated
   */
  public Adapter createCDPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDEllipse <em>CD Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDEllipse
   * @generated
   */
  public Adapter createCDEllipseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CDText <em>CD Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CDText
   * @generated
   */
  public Adapter createCDTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Line
   * @generated
   */
  public Adapter createLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Polyline
   * @generated
   */
  public Adapter createPolylineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Rectangle
   * @generated
   */
  public Adapter createRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangle <em>Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangle
   * @generated
   */
  public Adapter createRoundedRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Polygon
   * @generated
   */
  public Adapter createPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Ellipse
   * @generated
   */
  public Adapter createEllipseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo <em>Compartment Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentInfo
   * @generated
   */
  public Adapter createCompartmentInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Compartment <em>Compartment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Compartment
   * @generated
   */
  public Adapter createCompartmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentShape <em>Compartment Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentShape
   * @generated
   */
  public Adapter createCompartmentShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentRectangle <em>Compartment Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRectangle
   * @generated
   */
  public Adapter createCompartmentRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle <em>Compartment Rounded Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentRoundedRectangle
   * @generated
   */
  public Adapter createCompartmentRoundedRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentPolygon <em>Compartment Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentPolygon
   * @generated
   */
  public Adapter createCompartmentPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CompartmentEllipse <em>Compartment Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentEllipse
   * @generated
   */
  public Adapter createCompartmentEllipseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapeLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapeLayout
   * @generated
   */
  public Adapter createShapeLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout <em>Rectangle Ellipse Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.RectangleEllipseLayout
   * @generated
   */
  public Adapter createRectangleEllipseLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.LineLayout <em>Line Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.LineLayout
   * @generated
   */
  public Adapter createLineLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.PolyLineLayout <em>Poly Line Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.PolyLineLayout
   * @generated
   */
  public Adapter createPolyLineLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout <em>Rounded Rectangle Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.RoundedRectangleLayout
   * @generated
   */
  public Adapter createRoundedRectangleLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.TextLayout <em>Text Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.TextLayout
   * @generated
   */
  public Adapter createTextLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.ShapestyleLayout <em>Shapestyle Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.ShapestyleLayout
   * @generated
   */
  public Adapter createShapestyleLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.CommonLayout <em>Common Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.CommonLayout
   * @generated
   */
  public Adapter createCommonLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.TextBody <em>Text Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.TextBody
   * @generated
   */
  public Adapter createTextBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.shapes.shape.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.shapes.shape.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ShapeAdapterFactory
