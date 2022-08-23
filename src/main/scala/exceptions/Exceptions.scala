package exceptions

object Exceptions{
  case class FileReaderException(message: String) extends Exception(message)
  case class FileWriterException(message: String) extends Exception(message)
  case class DataframeIsEmptyException(message:String) extends Exception(message)
  case class ColumnNotFoundException(message:String) extends Exception(message)
  case class EmptyFilePathException(message:String) extends Exception(message)
  case class FilePathNotFoundException(message:String) extends Exception(message)
  case class InvalidInputFormatException(message:String) extends Exception(message)
  case class SchemaValidationFailedException(message : String) extends Exception(message)
  case class NullValuesExistException(message : String) extends Exception(message)
  case class DuplicateValuesExistException(message:String) extends Exception(message)
}
