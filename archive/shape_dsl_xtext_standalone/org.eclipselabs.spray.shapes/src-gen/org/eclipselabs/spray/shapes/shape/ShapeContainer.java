/**
 */
package org.eclipselabs.spray.shapes.shape;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.ShapeContainer#getShapeContainerElement <em>Shape Container Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getShapeContainer()
 * @model
 * @generated
 */
public interface ShapeContainer extends EObject
{
  /**
   * Returns the value of the '<em><b>Shape Container Element</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.shapes.shape.ShapeContainerElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape Container Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape Container Element</em>' containment reference list.
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getShapeContainer_ShapeContainerElement()
   * @model containment="true"
   * @generated
   */
  EList<ShapeContainerElement> getShapeContainerElement();

} // ShapeContainer
