/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch.core.msearch;

import org.opensearch.client.opensearch._types.ErrorResponse;

/**
 * Builders for {@link MultiSearchResponseItem} variants.
 */
public class MultiSearchResponseItemBuilders {
	private MultiSearchResponseItemBuilders() {
	}

	/**
	 * Creates a builder for the {@link MultiSearchItem result}
	 * {@code MultiSearchResponseItem} variant.
	 */
	public static <TDocument> MultiSearchItem.Builder<TDocument> result() {
		return new MultiSearchItem.Builder<TDocument>();
	}

	/**
	 * Creates a builder for the {@link ErrorResponse failure}
	 * {@code MultiSearchResponseItem} variant.
	 */
	public static <TDocument> ErrorResponse.Builder failure() {
		return new ErrorResponse.Builder();
	}

}
