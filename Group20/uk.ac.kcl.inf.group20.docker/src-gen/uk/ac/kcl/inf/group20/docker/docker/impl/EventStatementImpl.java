/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.group20.docker.docker.DockerPackage;
import uk.ac.kcl.inf.group20.docker.docker.EventOptions;
import uk.ac.kcl.inf.group20.docker.docker.EventStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.impl.EventStatementImpl#getEventOptions <em>Event Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventStatementImpl extends StatementsImpl implements EventStatement
{
  /**
   * The cached value of the '{@link #getEventOptions() <em>Event Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventOptions()
   * @generated
   * @ordered
   */
  protected EList<EventOptions> eventOptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventStatementImpl()
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
    return DockerPackage.Literals.EVENT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EventOptions> getEventOptions()
  {
    if (eventOptions == null)
    {
      eventOptions = new EObjectContainmentEList<EventOptions>(EventOptions.class, this, DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS);
    }
    return eventOptions;
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
      case DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS:
        return ((InternalEList<?>)getEventOptions()).basicRemove(otherEnd, msgs);
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
      case DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS:
        return getEventOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS:
        getEventOptions().clear();
        getEventOptions().addAll((Collection<? extends EventOptions>)newValue);
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
      case DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS:
        getEventOptions().clear();
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
      case DockerPackage.EVENT_STATEMENT__EVENT_OPTIONS:
        return eventOptions != null && !eventOptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventStatementImpl