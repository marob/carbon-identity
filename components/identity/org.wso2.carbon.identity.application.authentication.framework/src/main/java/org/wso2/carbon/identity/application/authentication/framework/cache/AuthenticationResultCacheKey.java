/*
 *Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *WSO2 Inc. licenses this file to you under the Apache License,
 *Version 2.0 (the "License"); you may not use this file except
 *in compliance with the License.
 *You may obtain a copy of the License at
 *
 *http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an
 *"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *KIND, either express or implied.  See the License for the
 *specific language governing permissions and limitations
 *under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.cache;

import org.wso2.carbon.identity.application.common.cache.CacheKey;

public class AuthenticationResultCacheKey extends CacheKey {
	
	private static final long serialVersionUID = 1749262006745636421L;
	
	private String resultId;

    public AuthenticationResultCacheKey(String resultId) {
        this.resultId = resultId;
    }

    public String getResultId() {
		return resultId;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AuthenticationResultCacheKey that = (AuthenticationResultCacheKey) o;

        if (!resultId.equals(that.resultId)) return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        return resultId.hashCode();
    }
}
