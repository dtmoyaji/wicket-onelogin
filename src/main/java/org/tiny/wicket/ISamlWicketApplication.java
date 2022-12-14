/*
 * Copyright 2022 bythe.
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
package org.tiny.wicket;

/**
 * このインターフェイスはAuthenticatedWebApplicationにインプリメントし、
 * SAMLのSSO、SLOエンドポイントの位置を定義するために使用する。
 */
public interface ISamlWicketApplication {
    
    /**
     * SamlLoginPageのマウントポイントを取得する。
     * @return マウントポイント
     */
    public String getSSOPageMountPoint();
    
    /**
     * SamlLogoutPageのマウントポイントを取得する。
     * @return マウントポイント
     */
    public String getSLOPageMountPoint();
}
