package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ECDHParamsMessage extends DHFragmentMessage {

	@SerializedName("curve_id")
	private CurveMessage curve;

	public CurveMessage getCurve() {
		return curve;
	}

	public class CurveMessage extends AbstractMessage {

		private int id;
		private String name;

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}
}
