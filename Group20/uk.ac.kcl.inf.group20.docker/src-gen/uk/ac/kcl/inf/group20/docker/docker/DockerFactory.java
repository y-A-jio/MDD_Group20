/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage
 * @generated
 */
public interface DockerFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DockerFactory eINSTANCE = uk.ac.kcl.inf.group20.docker.docker.impl.DockerFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements</em>'.
   * @generated
   */
  Statements createStatements();

  /**
   * Returns a new object of class '<em>Remove Image Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Image Statement</em>'.
   * @generated
   */
  RemoveImageStatement createRemoveImageStatement();

  /**
   * Returns a new object of class '<em>Image Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Statement</em>'.
   * @generated
   */
  ImageStatement createImageStatement();

  /**
   * Returns a new object of class '<em>Image Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Options</em>'.
   * @generated
   */
  ImageOptions createImageOptions();

  /**
   * Returns a new object of class '<em>Diff Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diff Statement</em>'.
   * @generated
   */
  DiffStatement createDiffStatement();

  /**
   * Returns a new object of class '<em>Cp Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cp Statement</em>'.
   * @generated
   */
  CpStatement createCpStatement();

  /**
   * Returns a new object of class '<em>Source Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Option</em>'.
   * @generated
   */
  SourceOption createSourceOption();

  /**
   * Returns a new object of class '<em>Commit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commit Statement</em>'.
   * @generated
   */
  CommitStatement createCommitStatement();

  /**
   * Returns a new object of class '<em>Commit Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commit Options</em>'.
   * @generated
   */
  CommitOptions createCommitOptions();

  /**
   * Returns a new object of class '<em>Port Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port Statement</em>'.
   * @generated
   */
  PortStatement createPortStatement();

  /**
   * Returns a new object of class '<em>Export Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export Statement</em>'.
   * @generated
   */
  ExportStatement createExportStatement();

  /**
   * Returns a new object of class '<em>Wait Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wait Statement</em>'.
   * @generated
   */
  WaitStatement createWaitStatement();

  /**
   * Returns a new object of class '<em>Logs Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logs Statement</em>'.
   * @generated
   */
  LogsStatement createLogsStatement();

  /**
   * Returns a new object of class '<em>Log Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Log Options</em>'.
   * @generated
   */
  LogOptions createLogOptions();

  /**
   * Returns a new object of class '<em>Event Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Statement</em>'.
   * @generated
   */
  EventStatement createEventStatement();

  /**
   * Returns a new object of class '<em>Event Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Options</em>'.
   * @generated
   */
  EventOptions createEventOptions();

  /**
   * Returns a new object of class '<em>Attach Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attach Statement</em>'.
   * @generated
   */
  AttachStatement createAttachStatement();

  /**
   * Returns a new object of class '<em>Inspect Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inspect Statement</em>'.
   * @generated
   */
  InspectStatement createInspectStatement();

  /**
   * Returns a new object of class '<em>Inspect Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inspect Options</em>'.
   * @generated
   */
  InspectOptions createInspectOptions();

  /**
   * Returns a new object of class '<em>Ps Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ps Statement</em>'.
   * @generated
   */
  PsStatement createPsStatement();

  /**
   * Returns a new object of class '<em>Ps Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ps Options</em>'.
   * @generated
   */
  PsOptions createPsOptions();

  /**
   * Returns a new object of class '<em>Exec Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exec Statement</em>'.
   * @generated
   */
  ExecStatement createExecStatement();

  /**
   * Returns a new object of class '<em>Unpause Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unpause Statement</em>'.
   * @generated
   */
  UnpauseStatement createUnpauseStatement();

  /**
   * Returns a new object of class '<em>Pause Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause Statement</em>'.
   * @generated
   */
  PauseStatement createPauseStatement();

  /**
   * Returns a new object of class '<em>Restart Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restart Statement</em>'.
   * @generated
   */
  RestartStatement createRestartStatement();

  /**
   * Returns a new object of class '<em>Stop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stop Statement</em>'.
   * @generated
   */
  StopStatement createStopStatement();

  /**
   * Returns a new object of class '<em>Start Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Statement</em>'.
   * @generated
   */
  StartStatement createStartStatement();

  /**
   * Returns a new object of class '<em>Kill Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kill Statement</em>'.
   * @generated
   */
  KillStatement createKillStatement();

  /**
   * Returns a new object of class '<em>Remove Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Statement</em>'.
   * @generated
   */
  RemoveStatement createRemoveStatement();

  /**
   * Returns a new object of class '<em>Run Create Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run Create Statement</em>'.
   * @generated
   */
  RunCreateStatement createRunCreateStatement();

  /**
   * Returns a new object of class '<em>Run Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run Option</em>'.
   * @generated
   */
  RunOption createRunOption();

  /**
   * Returns a new object of class '<em>Container Name Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Name Declaration</em>'.
   * @generated
   */
  ContainerNameDeclaration createContainerNameDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DockerPackage getDockerPackage();

} //DockerFactory