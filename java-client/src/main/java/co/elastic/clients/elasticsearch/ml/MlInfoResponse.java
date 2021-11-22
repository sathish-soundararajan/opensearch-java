/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch.ml.info.Defaults;
import co.elastic.clients.elasticsearch.ml.info.Limits;
import co.elastic.clients.elasticsearch.ml.info.NativeCode;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml.info.Response
@JsonpDeserializable
public class MlInfoResponse implements JsonpSerializable {
	private final Defaults defaults;

	private final Limits limits;

	private final boolean upgradeMode;

	private final NativeCode nativeCode;

	// ---------------------------------------------------------------------------------------------

	private MlInfoResponse(Builder builder) {

		this.defaults = ModelTypeHelper.requireNonNull(builder.defaults, this, "defaults");
		this.limits = ModelTypeHelper.requireNonNull(builder.limits, this, "limits");
		this.upgradeMode = ModelTypeHelper.requireNonNull(builder.upgradeMode, this, "upgradeMode");
		this.nativeCode = ModelTypeHelper.requireNonNull(builder.nativeCode, this, "nativeCode");

	}

	public static MlInfoResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code defaults}
	 */
	public final Defaults defaults() {
		return this.defaults;
	}

	/**
	 * Required - API name: {@code limits}
	 */
	public final Limits limits() {
		return this.limits;
	}

	/**
	 * Required - API name: {@code upgrade_mode}
	 */
	public final boolean upgradeMode() {
		return this.upgradeMode;
	}

	/**
	 * Required - API name: {@code native_code}
	 */
	public final NativeCode nativeCode() {
		return this.nativeCode;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("defaults");
		this.defaults.serialize(generator, mapper);

		generator.writeKey("limits");
		this.limits.serialize(generator, mapper);

		generator.writeKey("upgrade_mode");
		generator.write(this.upgradeMode);

		generator.writeKey("native_code");
		this.nativeCode.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInfoResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlInfoResponse> {
		private Defaults defaults;

		private Limits limits;

		private Boolean upgradeMode;

		private NativeCode nativeCode;

		/**
		 * Required - API name: {@code defaults}
		 */
		public final Builder defaults(Defaults value) {
			this.defaults = value;
			return this;
		}

		/**
		 * Required - API name: {@code defaults}
		 */
		public final Builder defaults(Consumer<Defaults.Builder> fn) {
			Defaults.Builder builder = new Defaults.Builder();
			fn.accept(builder);
			return this.defaults(builder.build());
		}

		/**
		 * Required - API name: {@code limits}
		 */
		public final Builder limits(Limits value) {
			this.limits = value;
			return this;
		}

		/**
		 * Required - API name: {@code limits}
		 */
		public final Builder limits(Consumer<Limits.Builder> fn) {
			Limits.Builder builder = new Limits.Builder();
			fn.accept(builder);
			return this.limits(builder.build());
		}

		/**
		 * Required - API name: {@code upgrade_mode}
		 */
		public final Builder upgradeMode(boolean value) {
			this.upgradeMode = value;
			return this;
		}

		/**
		 * Required - API name: {@code native_code}
		 */
		public final Builder nativeCode(NativeCode value) {
			this.nativeCode = value;
			return this;
		}

		/**
		 * Required - API name: {@code native_code}
		 */
		public final Builder nativeCode(Consumer<NativeCode.Builder> fn) {
			NativeCode.Builder builder = new NativeCode.Builder();
			fn.accept(builder);
			return this.nativeCode(builder.build());
		}

		/**
		 * Builds a {@link MlInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInfoResponse build() {
			_checkSingleUse();

			return new MlInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInfoResponse}
	 */
	public static final JsonpDeserializer<MlInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MlInfoResponse::setupMlInfoResponseDeserializer);

	protected static void setupMlInfoResponseDeserializer(ObjectDeserializer<MlInfoResponse.Builder> op) {

		op.add(Builder::defaults, Defaults._DESERIALIZER, "defaults");
		op.add(Builder::limits, Limits._DESERIALIZER, "limits");
		op.add(Builder::upgradeMode, JsonpDeserializer.booleanDeserializer(), "upgrade_mode");
		op.add(Builder::nativeCode, NativeCode._DESERIALIZER, "native_code");

	}

}