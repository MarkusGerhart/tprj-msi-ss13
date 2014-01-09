/**
 */
package org.eclipselabs.spray.shapes.shape.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.shape.ShapeLayout;
import org.eclipselabs.spray.shapes.shape.ShapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getMinwidth <em>Minwidth</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getMinheight <em>Minheight</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getMaxwidth <em>Maxwidth</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getMaxheight <em>Maxheight</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getStretchH <em>Stretch H</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getStretchV <em>Stretch V</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.ShapeLayoutImpl#getProportional <em>Proportional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeLayoutImpl extends MinimalEObjectImpl.Container implements ShapeLayout
{
  /**
   * The default value of the '{@link #getMinwidth() <em>Minwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinwidth()
   * @generated
   * @ordered
   */
  protected static final int MINWIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinwidth() <em>Minwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinwidth()
   * @generated
   * @ordered
   */
  protected int minwidth = MINWIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMinheight() <em>Minheight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinheight()
   * @generated
   * @ordered
   */
  protected static final int MINHEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinheight() <em>Minheight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinheight()
   * @generated
   * @ordered
   */
  protected int minheight = MINHEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxwidth() <em>Maxwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxwidth()
   * @generated
   * @ordered
   */
  protected static final int MAXWIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxwidth() <em>Maxwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxwidth()
   * @generated
   * @ordered
   */
  protected int maxwidth = MAXWIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxheight() <em>Maxheight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxheight()
   * @generated
   * @ordered
   */
  protected static final int MAXHEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxheight() <em>Maxheight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxheight()
   * @generated
   * @ordered
   */
  protected int maxheight = MAXHEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getStretchH() <em>Stretch H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchH()
   * @generated
   * @ordered
   */
  protected static final String STRETCH_H_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStretchH() <em>Stretch H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchH()
   * @generated
   * @ordered
   */
  protected String stretchH = STRETCH_H_EDEFAULT;

  /**
   * The default value of the '{@link #getStretchV() <em>Stretch V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchV()
   * @generated
   * @ordered
   */
  protected static final String STRETCH_V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStretchV() <em>Stretch V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStretchV()
   * @generated
   * @ordered
   */
  protected String stretchV = STRETCH_V_EDEFAULT;

  /**
   * The default value of the '{@link #getProportional() <em>Proportional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProportional()
   * @generated
   * @ordered
   */
  protected static final String PROPORTIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProportional() <em>Proportional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProportional()
   * @generated
   * @ordered
   */
  protected String proportional = PROPORTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeLayoutImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ShapePackage.Literals.SHAPE_LAYOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinwidth()
  {
    return minwidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinwidth(int newMinwidth)
  {
    int oldMinwidth = minwidth;
    minwidth = newMinwidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__MINWIDTH, oldMinwidth, minwidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinheight()
  {
    return minheight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinheight(int newMinheight)
  {
    int oldMinheight = minheight;
    minheight = newMinheight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__MINHEIGHT, oldMinheight, minheight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxwidth()
  {
    return maxwidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxwidth(int newMaxwidth)
  {
    int oldMaxwidth = maxwidth;
    maxwidth = newMaxwidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__MAXWIDTH, oldMaxwidth, maxwidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxheight()
  {
    return maxheight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxheight(int newMaxheight)
  {
    int oldMaxheight = maxheight;
    maxheight = newMaxheight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__MAXHEIGHT, oldMaxheight, maxheight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStretchH()
  {
    return stretchH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStretchH(String newStretchH)
  {
    String oldStretchH = stretchH;
    stretchH = newStretchH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__STRETCH_H, oldStretchH, stretchH));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStretchV()
  {
    return stretchV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStretchV(String newStretchV)
  {
    String oldStretchV = stretchV;
    stretchV = newStretchV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__STRETCH_V, oldStretchV, stretchV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProportional()
  {
    return proportional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProportional(String newProportional)
  {
    String oldProportional = proportional;
    proportional = newProportional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.SHAPE_LAYOUT__PROPORTIONAL, oldProportional, proportional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShapePackage.SHAPE_LAYOUT__MINWIDTH:
        return getMinwidth();
      case ShapePackage.SHAPE_LAYOUT__MINHEIGHT:
        return getMinheight();
      case ShapePackage.SHAPE_LAYOUT__MAXWIDTH:
        return getMaxwidth();
      case ShapePackage.SHAPE_LAYOUT__MAXHEIGHT:
        return getMaxheight();
      case ShapePackage.SHAPE_LAYOUT__STRETCH_H:
        return getStretchH();
      case ShapePackage.SHAPE_LAYOUT__STRETCH_V:
        return getStretchV();
      case ShapePackage.SHAPE_LAYOUT__PROPORTIONAL:
        return getProportional();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShapePackage.SHAPE_LAYOUT__MINWIDTH:
        setMinwidth((Integer)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__MINHEIGHT:
        setMinheight((Integer)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__MAXWIDTH:
        setMaxwidth((Integer)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__MAXHEIGHT:
        setMaxheight((Integer)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__STRETCH_H:
        setStretchH((String)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__STRETCH_V:
        setStretchV((String)newValue);
        return;
      case ShapePackage.SHAPE_LAYOUT__PROPORTIONAL:
        setProportional((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.SHAPE_LAYOUT__MINWIDTH:
        setMinwidth(MINWIDTH_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__MINHEIGHT:
        setMinheight(MINHEIGHT_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__MAXWIDTH:
        setMaxwidth(MAXWIDTH_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__MAXHEIGHT:
        setMaxheight(MAXHEIGHT_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__STRETCH_H:
        setStretchH(STRETCH_H_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__STRETCH_V:
        setStretchV(STRETCH_V_EDEFAULT);
        return;
      case ShapePackage.SHAPE_LAYOUT__PROPORTIONAL:
        setProportional(PROPORTIONAL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.SHAPE_LAYOUT__MINWIDTH:
        return minwidth != MINWIDTH_EDEFAULT;
      case ShapePackage.SHAPE_LAYOUT__MINHEIGHT:
        return minheight != MINHEIGHT_EDEFAULT;
      case ShapePackage.SHAPE_LAYOUT__MAXWIDTH:
        return maxwidth != MAXWIDTH_EDEFAULT;
      case ShapePackage.SHAPE_LAYOUT__MAXHEIGHT:
        return maxheight != MAXHEIGHT_EDEFAULT;
      case ShapePackage.SHAPE_LAYOUT__STRETCH_H:
        return STRETCH_H_EDEFAULT == null ? stretchH != null : !STRETCH_H_EDEFAULT.equals(stretchH);
      case ShapePackage.SHAPE_LAYOUT__STRETCH_V:
        return STRETCH_V_EDEFAULT == null ? stretchV != null : !STRETCH_V_EDEFAULT.equals(stretchV);
      case ShapePackage.SHAPE_LAYOUT__PROPORTIONAL:
        return PROPORTIONAL_EDEFAULT == null ? proportional != null : !PROPORTIONAL_EDEFAULT.equals(proportional);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (minwidth: ");
    result.append(minwidth);
    result.append(", minheight: ");
    result.append(minheight);
    result.append(", maxwidth: ");
    result.append(maxwidth);
    result.append(", maxheight: ");
    result.append(maxheight);
    result.append(", stretchH: ");
    result.append(stretchH);
    result.append(", stretchV: ");
    result.append(stretchV);
    result.append(", proportional: ");
    result.append(proportional);
    result.append(')');
    return result.toString();
  }

} //ShapeLayoutImpl
