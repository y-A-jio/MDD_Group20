/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration;
import uk.ac.kcl.inf.group20.docker.docker.DockerPackage;
import uk.ac.kcl.inf.group20.docker.docker.WaitStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.impl.WaitStatementImpl#getContainerName <em>Container Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitStatementImpl extends StatementsImpl implements WaitStatement
{
  /**
   * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerName()
   * @generated
   * @ordered
   */
  protected ContainerNameDeclaration containerName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WaitStatementImpl()
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
    return DockerPackage.Literals.WAIT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContainerNameDeclaration getContainerName()
  {
    if (containerName != null && containerName.eIsProxy())
    {
      InternalEObject oldContainerName = (InternalEObject)containerName;
      containerName = (ContainerNameDeclaration)eResolveProxy(oldContainerName);
      if (containerName != oldContainerName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerPackage.WAIT_STATEMENT__CONTAINER_NAME, oldContainerName, containerName));
      }
    }
    return containerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerNameDeclaration basicGetContainerName()
  {
    return containerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainerName(ContainerNameDeclaration newContainerName)
  {
    ContainerNameDeclaration oldContainerName = containerName;
    containerName = newContainerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.WAIT_STATEMENT__CONTAINER_NAME, oldContainerName, containerName));
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
      case DockerPackage.WAIT_STATEMENT__CONTAINER_NAME:
        if (resolve) return getContainerName();
        return basicGetContainerName();
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
      case DockerPackage.WAIT_STATEMENT__CONTAINER_NAME:
        setContainerName((ContainerNameDeclaration)newValue);
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
      case DockerPackage.WAIT_STATEMENT__CONTAINER_NAME:
        setContainerName((ContainerNameDeclaration)null);
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
      case DockerPackage.WAIT_STATEMENT__CONTAINER_NAME:
        return containerName != null;
    }
    return super.eIsSet(featureID);
  }

} //WaitStatementImpl