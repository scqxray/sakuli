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

package de.consol.sakuli.loader;

import de.consol.sakuli.actions.environment.CipherUtil;
import de.consol.sakuli.datamodel.TestCase;
import de.consol.sakuli.datamodel.TestSuite;
import de.consol.sakuli.datamodel.actions.ImageLib;
import de.consol.sakuli.exceptions.SakuliExceptionHandler;
import net.sf.sahi.report.Report;
import net.sf.sahi.rhino.RhinoScriptRunner;

/**
 * @author Tobias Schneck
 */
public interface BaseActionLoader {

    SakuliExceptionHandler getExceptionHandler();

    TestSuite getTestSuite();

    TestCase getCurrentTestCase();

    ImageLib getImageLib();

    RhinoScriptRunner getRhinoScriptRunner();

    Report getSahiReport();

    CipherUtil getCipherUtil();

}
