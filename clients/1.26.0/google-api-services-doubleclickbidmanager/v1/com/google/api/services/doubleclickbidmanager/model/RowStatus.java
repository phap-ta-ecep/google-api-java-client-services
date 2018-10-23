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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Represents the upload status of a row in the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RowStatus extends com.google.api.client.json.GenericJson {

  /**
   * Whether the stored entity is changed as a result of upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean changed;

  /**
   * Entity Id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long entityId;

  /**
   * Entity name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityName;

  /**
   * Reasons why the entity can't be uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> errors;

  /**
   * Whether the entity is persisted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean persisted;

  /**
   * Row number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowNumber;

  /**
   * Whether the stored entity is changed as a result of upload.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getChanged() {
    return changed;
  }

  /**
   * Whether the stored entity is changed as a result of upload.
   * @param changed changed or {@code null} for none
   */
  public RowStatus setChanged(java.lang.Boolean changed) {
    this.changed = changed;
    return this;
  }

  /**
   * Entity Id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEntityId() {
    return entityId;
  }

  /**
   * Entity Id.
   * @param entityId entityId or {@code null} for none
   */
  public RowStatus setEntityId(java.lang.Long entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Entity name.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityName() {
    return entityName;
  }

  /**
   * Entity name.
   * @param entityName entityName or {@code null} for none
   */
  public RowStatus setEntityName(java.lang.String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Reasons why the entity can't be uploaded.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getErrors() {
    return errors;
  }

  /**
   * Reasons why the entity can't be uploaded.
   * @param errors errors or {@code null} for none
   */
  public RowStatus setErrors(java.util.List<java.lang.String> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Whether the entity is persisted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPersisted() {
    return persisted;
  }

  /**
   * Whether the entity is persisted.
   * @param persisted persisted or {@code null} for none
   */
  public RowStatus setPersisted(java.lang.Boolean persisted) {
    this.persisted = persisted;
    return this;
  }

  /**
   * Row number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowNumber() {
    return rowNumber;
  }

  /**
   * Row number.
   * @param rowNumber rowNumber or {@code null} for none
   */
  public RowStatus setRowNumber(java.lang.Integer rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

  @Override
  public RowStatus set(String fieldName, Object value) {
    return (RowStatus) super.set(fieldName, value);
  }

  @Override
  public RowStatus clone() {
    return (RowStatus) super.clone();
  }

}