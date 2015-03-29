package com.noAdd.enums;

public class EnumConstents {

	public static enum EnumCodes {
		DOCUMENT_NOT_FOUND("docunet-not-found"),
		DOCUMENT_FOUND("docunet-found"),
		REQUEST_DATA_INVALID("request-data-invalid"),
		REQUEST_DATA_VALID("request-data-valid"),
		DOCUMENT_SAVED("document-saved");

		private EnumCodes(final String text) {
			this.text = text;
		}

		private final String text;

		public String getValue() {
			return text;
		}
	}
}
