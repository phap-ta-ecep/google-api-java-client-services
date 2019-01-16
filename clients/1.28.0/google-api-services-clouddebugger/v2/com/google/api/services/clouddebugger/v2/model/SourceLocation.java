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

package com.google.api.services.clouddebugger.v2.model;

/**
 * Represents a location in the source code.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Debugger API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceLocation extends com.google.api.client.json.GenericJson {

  /**
   * Column within a line. The first column in a line as the value `1`. Agents that do not support
   * setting breakpoints on specific columns ignore this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer column;

  /**
   * Line inside the file. The first line in the file has the value `1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer line;

  /**
   * Path to the source file within the source context of the target binary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Column within a line. The first column in a line as the value `1`. Agents that do not support
   * setting breakpoints on specific columns ignore this field.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumn() {
    return column;
  }

  /**
   * Column within a line. The first column in a line as the value `1`. Agents that do not support
   * setting breakpoints on specific columns ignore this field.
   * @param column column or {@code null} for none
   */
  public SourceLocation setColumn(java.lang.Integer column) {
    this.column = column;
    return this;
  }

  /**
   * Line inside the file. The first line in the file has the value `1`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLine() {
    return line;
  }

  /**
   * Line inside the file. The first line in the file has the value `1`.
   * @param line line or {@code null} for none
   */
  public SourceLocation setLine(java.lang.Integer line) {
    this.line = line;
    return this;
  }

  /**
   * Path to the source file within the source context of the target binary.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path to the source file within the source context of the target binary.
   * @param path path or {@code null} for none
   */
  public SourceLocation setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public SourceLocation set(String fieldName, Object value) {
    return (SourceLocation) super.set(fieldName, value);
  }

  @Override
  public SourceLocation clone() {
    return (SourceLocation) super.clone();
  }

}