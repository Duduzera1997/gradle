/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.provider;

import org.gradle.api.Action;
import org.gradle.api.Incubating;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ValueSource;
import org.gradle.api.provider.ValueSourceParameters;
import org.gradle.api.provider.ValueSourceSpec;

/**
 * Service to create providers from {@link ValueSource}s.
 *
 * Separate from {@link org.gradle.api.provider.ProviderFactory} so it can be implemented in the instant-execution module.
 *
 * @since 6.1
 */
@Incubating
public interface ValueSourceProviderFactory {

    <T, P extends ValueSourceParameters> Provider<T> createProviderOf(Class<? extends ValueSource<T, P>> valueSourceType, Action<? super ValueSourceSpec<P>> configuration);
}
