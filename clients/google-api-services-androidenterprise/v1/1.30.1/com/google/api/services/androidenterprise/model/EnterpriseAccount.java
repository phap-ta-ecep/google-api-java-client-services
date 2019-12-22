/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.androidenterprise.model;

/**
 * A service account that can be used to authenticate as the enterprise to API calls that require
 * such authentication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseAccount extends com.google.api.client.json.GenericJson {

  /**
   * The email address of the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountEmail;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The email address of the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountEmail() {
    return accountEmail;
  }

  /**
   * The email address of the service account.
   * @param accountEmail accountEmail or {@code null} for none
   */
  public EnterpriseAccount setAccountEmail(java.lang.String accountEmail) {
    this.accountEmail = accountEmail;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public EnterpriseAccount setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public EnterpriseAccount set(String fieldName, Object value) {
    return (EnterpriseAccount) super.set(fieldName, value);
  }

  @Override
  public EnterpriseAccount clone() {
    return (EnterpriseAccount) super.clone();
  }

}
