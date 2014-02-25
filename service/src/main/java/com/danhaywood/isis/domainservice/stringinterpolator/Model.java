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
package com.danhaywood.isis.domainservice.stringinterpolator;

import java.util.Map;

/**
 * Acts as the context for the OGNL evaluation.
 * 
 *
 * @version $Rev$ $Date$
 */
class Model {
    
    private Object _this;
    private Map<String, String> _properties;
    public Model(final Object context, final Map<String, String> properties) {
        this._this = context;
        this._properties = properties;
    }
    public Object getThis() { return _this; }
    public Map<String,String> getProperties() { return _properties; }
}