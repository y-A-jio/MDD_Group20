/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getOption <em>Option</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getFormats <em>Formats</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getImageOptions()
 * @model
 * @generated
 */
public interface ImageOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getImageOptions_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getImageOptions_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Formats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formats</em>' attribute.
   * @see #setFormats(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getImageOptions_Formats()
   * @model
   * @generated
   */
  String getFormats();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions#getFormats <em>Formats</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formats</em>' attribute.
   * @see #getFormats()
   * @generated
   */
  void setFormats(String value);

} // ImageOptions