/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.EventStatement#getEventOptions <em>Event Options</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getEventStatement()
 * @model
 * @generated
 */
public interface EventStatement extends Statements
{
  /**
   * Returns the value of the '<em><b>Event Options</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group20.docker.docker.EventOptions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Options</em>' containment reference list.
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getEventStatement_EventOptions()
   * @model containment="true"
   * @generated
   */
  EList<EventOptions> getEventOptions();

} // EventStatement