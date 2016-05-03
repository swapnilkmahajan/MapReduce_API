package neu.mr.cs6240.sharedobjects;

import java.io.Serializable;

/**
 * Error codes exchanged b/w client and server
 *
 * @author smitha
 *
 */
public enum ERR_CODE implements Serializable {

		INPUT_FILES_NOT_DOWNLOADED_S3(25),
		OUT_OF_MEMORRY_ERROR(2),
		INVALID_COMMAND_FROM_SERVER(-100),

		JAR_NOT_FOUND(3),
		UNABLE_TO_LOAD_JAR(4),

		MAP_SUCCESS(0),
		MAP_CLASS_NOT_FOUND(5),
		UNABLE_TO_INST_MAP_CLASS(7),
		MAP_CLASS_ILLEGAL_ACCESS(9),
		NO_SUCH_METHOD_IN_MAP_CLASS(11),
		MAP_METHOD_SECURITY_EXCEPTION(13),
		MAP_METHOD_ILLEGAL_ACCESS(15),
		MAP_METHOD_ILLEGAL_ARG(17),
		MAP_API_OR_USER_MAPPER_ERROR(19),
		EXCEPTION_CREATING_TEMP_DIR_MAP(21),
		EXCEPTION_DELETING_TEMP_DIR_MAP(23),

		REDUCE_SUCCESS(1),
		REDUCE_CLASS_NOT_FOUND(6),
		UNABLE_TO_INST_REDUCE_CLASS(8),
		REDUCE_CLASS_ILLEGAL_ACCESS(10),
		NO_SUCH_METHOD_IN_REDUCE_CLASS(12),
		REDUCE_METHOD_SECURITY_EXCEPTION(14),
		REDUCE_METHOD_ILLEGAL_ACCESS(16),
		REDUCE_METHOD_ILLEGAL_ARG(18),
		REDUCE_API_OR_USER_REDUCER_ERROR(20),
		EXCEPTION_CREATING_TEMP_DIR_REDUCE(22),
		EXCEPTION_DELETING_TEMP_DIR_REDUCE(24),

		LOG_SUCCESS(25);

	private int code;

	private ERR_CODE(int value) {
		this.code = value;
	}

	public int val() {
		return code;
	}
}
