/**
 */
package org.eclipselabs.spray.shapes.shape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getCompartmentLayout <em>Compartment Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchH <em>Stretch H</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchV <em>Stretch V</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo()
 * @model
 * @generated
 */
public interface CompartmentInfo extends EObject
{
  /**
   * Returns the value of the '<em><b>Compartment Layout</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.shape.CompartmentLayout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compartment Layout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compartment Layout</em>' attribute.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentLayout
   * @see #setCompartmentLayout(CompartmentLayout)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_CompartmentLayout()
   * @model
   * @generated
   */
  CompartmentLayout getCompartmentLayout();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getCompartmentLayout <em>Compartment Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compartment Layout</em>' attribute.
   * @see org.eclipselabs.spray.shapes.shape.CompartmentLayout
   * @see #getCompartmentLayout()
   * @generated
   */
  void setCompartmentLayout(CompartmentLayout value);

  /**
   * Returns the value of the '<em><b>Stretch H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stretch H</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stretch H</em>' attribute.
   * @see #setStretchH(String)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_StretchH()
   * @model
   * @generated
   */
  String getStretchH();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchH <em>Stretch H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stretch H</em>' attribute.
   * @see #getStretchH()
   * @generated
   */
  void setStretchH(String value);

  /**
   * Returns the value of the '<em><b>Stretch V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stretch V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stretch V</em>' attribute.
   * @see #setStretchV(String)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_StretchV()
   * @model
   * @generated
   */
  String getStretchV();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getStretchV <em>Stretch V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stretch V</em>' attribute.
   * @see #getStretchV()
   * @generated
   */
  void setStretchV(String value);

  /**
   * Returns the value of the '<em><b>Spacing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spacing</em>' attribute.
   * @see #setSpacing(int)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_Spacing()
   * @model
   * @generated
   */
  int getSpacing();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getSpacing <em>Spacing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spacing</em>' attribute.
   * @see #getSpacing()
   * @generated
   */
  void setSpacing(int value);

  /**
   * Returns the value of the '<em><b>Margin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin</em>' attribute.
   * @see #setMargin(int)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_Margin()
   * @model
   * @generated
   */
  int getMargin();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getMargin <em>Margin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin</em>' attribute.
   * @see #getMargin()
   * @generated
   */
  void setMargin(int value);

  /**
   * Returns the value of the '<em><b>Invisible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invisible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invisible</em>' attribute.
   * @see #setInvisible(boolean)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_Invisible()
   * @model
   * @generated
   */
  boolean isInvisible();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#isInvisible <em>Invisible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invisible</em>' attribute.
   * @see #isInvisible()
   * @generated
   */
  void setInvisible(boolean value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(TextBody)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getCompartmentInfo_Id()
   * @model containment="true"
   * @generated
   */
  TextBody getId();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.CompartmentInfo#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(TextBody value);

} // CompartmentInfo
