/**
 */
package org.eclipselabs.spray.shapes.shape.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.shape.Description;
import org.eclipselabs.spray.shapes.shape.HAlign;
import org.eclipselabs.spray.shapes.shape.ShapePackage;
import org.eclipselabs.spray.shapes.shape.TextBody;
import org.eclipselabs.spray.shapes.shape.VAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.DescriptionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description
{
  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final String STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected String style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHAlign()
   * @generated
   * @ordered
   */
  protected static final HAlign HALIGN_EDEFAULT = HAlign.LEFT;

  /**
   * The cached value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHAlign()
   * @generated
   * @ordered
   */
  protected HAlign hAlign = HALIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getVAlign() <em>VAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVAlign()
   * @generated
   * @ordered
   */
  protected static final VAlign VALIGN_EDEFAULT = VAlign.TOP;

  /**
   * The cached value of the '{@link #getVAlign() <em>VAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVAlign()
   * @generated
   * @ordered
   */
  protected VAlign vAlign = VALIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected TextBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionImpl()
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
    return ShapePackage.Literals.DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(String newStyle)
  {
    String oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.DESCRIPTION__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HAlign getHAlign()
  {
    return hAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHAlign(HAlign newHAlign)
  {
    HAlign oldHAlign = hAlign;
    hAlign = newHAlign == null ? HALIGN_EDEFAULT : newHAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.DESCRIPTION__HALIGN, oldHAlign, hAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlign getVAlign()
  {
    return vAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVAlign(VAlign newVAlign)
  {
    VAlign oldVAlign = vAlign;
    vAlign = newVAlign == null ? VALIGN_EDEFAULT : newVAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.DESCRIPTION__VALIGN, oldVAlign, vAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(TextBody newBody, NotificationChain msgs)
  {
    TextBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapePackage.DESCRIPTION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(TextBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapePackage.DESCRIPTION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapePackage.DESCRIPTION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.DESCRIPTION__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ShapePackage.DESCRIPTION__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ShapePackage.DESCRIPTION__STYLE:
        return getStyle();
      case ShapePackage.DESCRIPTION__HALIGN:
        return getHAlign();
      case ShapePackage.DESCRIPTION__VALIGN:
        return getVAlign();
      case ShapePackage.DESCRIPTION__BODY:
        return getBody();
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
      case ShapePackage.DESCRIPTION__STYLE:
        setStyle((String)newValue);
        return;
      case ShapePackage.DESCRIPTION__HALIGN:
        setHAlign((HAlign)newValue);
        return;
      case ShapePackage.DESCRIPTION__VALIGN:
        setVAlign((VAlign)newValue);
        return;
      case ShapePackage.DESCRIPTION__BODY:
        setBody((TextBody)newValue);
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
      case ShapePackage.DESCRIPTION__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case ShapePackage.DESCRIPTION__HALIGN:
        setHAlign(HALIGN_EDEFAULT);
        return;
      case ShapePackage.DESCRIPTION__VALIGN:
        setVAlign(VALIGN_EDEFAULT);
        return;
      case ShapePackage.DESCRIPTION__BODY:
        setBody((TextBody)null);
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
      case ShapePackage.DESCRIPTION__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case ShapePackage.DESCRIPTION__HALIGN:
        return hAlign != HALIGN_EDEFAULT;
      case ShapePackage.DESCRIPTION__VALIGN:
        return vAlign != VALIGN_EDEFAULT;
      case ShapePackage.DESCRIPTION__BODY:
        return body != null;
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
    result.append(" (style: ");
    result.append(style);
    result.append(", hAlign: ");
    result.append(hAlign);
    result.append(", vAlign: ");
    result.append(vAlign);
    result.append(')');
    return result.toString();
  }

} //DescriptionImpl
