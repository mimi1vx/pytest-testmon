package sk.infinit.testmon.services.cache

import sk.infinit.testmon.database.FileMarkType
import sk.infinit.testmon.database.PyException
import sk.infinit.testmon.database.PyFileMark

/**
 * Runtime info cache interface.
 */
interface Cache {
    fun getPyFileMarks(absolutePyFilePath: String, fileMarkType: FileMarkType): List<PyFileMark>?

    fun setPyFileMarksCache(keyPair : Pair<String, FileMarkType>, fileMarks : List<PyFileMark>)

    fun setPyExceptionCache(key : Int, pyException : PyException)

    fun clear()
}