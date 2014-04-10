/*
 * Sakuli - Testing and Monitoring-Tool for Websites and common UIs.
 *
 * Copyright 2013 - 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.consol.sakuli.datamodel.actions;

import org.springframework.stereotype.Component;

/**
 * Wrapper for the {@link org.sikuli.script.Screen} object to get this
 * as Spring bean.
 *
 * @author Tobias Schneck
 */
@Component
public class Screen extends org.sikuli.script.Screen {
    public Screen(int id) throws Exception {
        super(id);
    }

    public Screen(boolean isScreenUnion) {
        super(isScreenUnion);
    }

    public Screen() {
        super();
    }
}