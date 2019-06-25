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

package com.google.api.services.youtubereporting.model;

/**
 * A report type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportType extends com.google.api.client.json.GenericJson {

  /**
   * The date/time when this report type was/will be deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deprecateTime;

  /**
   * The ID of the report type (max. 100 characters).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The name of the report type (max. 100 characters).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * True if this a system-managed report type; otherwise false. Reporting jobs for system-managed
   * report types are created automatically and can thus not be used in the `CreateJob` method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean systemManaged;

  /**
   * The date/time when this report type was/will be deprecated.
   * @return value or {@code null} for none
   */
  public String getDeprecateTime() {
    return deprecateTime;
  }

  /**
   * The date/time when this report type was/will be deprecated.
   * @param deprecateTime deprecateTime or {@code null} for none
   */
  public ReportType setDeprecateTime(String deprecateTime) {
    this.deprecateTime = deprecateTime;
    return this;
  }

  /**
   * The ID of the report type (max. 100 characters).
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the report type (max. 100 characters).
   * @param id id or {@code null} for none
   */
  public ReportType setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The name of the report type (max. 100 characters).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the report type (max. 100 characters).
   * @param name name or {@code null} for none
   */
  public ReportType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * True if this a system-managed report type; otherwise false. Reporting jobs for system-managed
   * report types are created automatically and can thus not be used in the `CreateJob` method.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSystemManaged() {
    return systemManaged;
  }

  /**
   * True if this a system-managed report type; otherwise false. Reporting jobs for system-managed
   * report types are created automatically and can thus not be used in the `CreateJob` method.
   * @param systemManaged systemManaged or {@code null} for none
   */
  public ReportType setSystemManaged(java.lang.Boolean systemManaged) {
    this.systemManaged = systemManaged;
    return this;
  }

  @Override
  public ReportType set(String fieldName, Object value) {
    return (ReportType) super.set(fieldName, value);
  }

  @Override
  public ReportType clone() {
    return (ReportType) super.clone();
  }

}
