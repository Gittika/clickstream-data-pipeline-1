
import exceptions.Exceptions.{ColumnNotFoundException, DataframeIsEmptyException, EmptyFilePathException, FilePathNotFoundException, FileReaderException, FileWriterException}
import service.DataPipeline.{execute, log}

import scala.sys.exit

object ClickStream {
  def main(args: Array[String]): Unit = {

    try {
      //performing reader and cleanser operations on both dataset
      execute()

    } catch {
      case ex: FileReaderException => log.error("File Reader Exception: " + ex.message)
        exit(1)
      case ex: DataframeIsEmptyException => log.error("DataFrameIsEmptyException:" + ex.message)
        exit(1)
      case ex: ColumnNotFoundException => log.error("ColumnNotFoundException:" + ex.message)
        exit(1)
      case ex : EmptyFilePathException => log.error("EmptyFilePathException:" + ex.message)
        exit(1)
      case ex : FilePathNotFoundException => log.error("FilePathNotFoundException:" + ex.message)
        exit(1)
      case ex: FileWriterException => log.error("FileWriterException:" + ex.message)
        exit(1)

    }


  }

}
