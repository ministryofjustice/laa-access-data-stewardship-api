package uk.gov.justice.laa.access.datastore.exception;

/**
 * The exception thrown when application not found.
 */
public class ApplicationNotFoundException extends RuntimeException {

  /**
   * Constructor for ApplicationNotFoundException.
   *
   * @param message the error message
   */
  public ApplicationNotFoundException(String message) {
    super(message);
  }
}
