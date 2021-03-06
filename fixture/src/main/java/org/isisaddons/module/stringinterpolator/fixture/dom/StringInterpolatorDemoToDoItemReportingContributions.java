/*
 *  Copyright 2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.stringinterpolator.fixture.dom;

import java.net.MalformedURLException;
import java.net.URL;
import org.isisaddons.module.stringinterpolator.dom.StringInterpolatorService;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.Contributed;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;

@DomainService(
        nature = NatureOfService.VIEW_CONTRIBUTIONS_ONLY
)
public class StringInterpolatorDemoToDoItemReportingContributions {

    public static final String TEMPLATE = "${properties['isis.website']}/${this.documentationPage}";

    @ActionLayout(
            contributed = Contributed.AS_ACTION
    )
    public URL open(final StringInterpolatorDemoToDoItem toDoItem) throws MalformedURLException {
        final String urlStr = stringInterpolatorService.interpolate(toDoItem, TEMPLATE);
        return new URL(urlStr);
    }

    // //////////////////////////////////////

    @javax.inject.Inject
    private StringInterpolatorService stringInterpolatorService;
}

