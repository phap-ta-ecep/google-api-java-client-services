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

package com.google.api.services.file.v1beta1.model;

/**
 * SloEligibility is a tuple containing eligibility value: true if an instance is eligible for SLO
 * calculation or false if it should be excluded from all SLO-related calculations along with a
 * user-defined reason.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility extends com.google.api.client.json.GenericJson {

  /**
   * Whether an instance is eligible or ineligible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean eligible;

  /**
   * User-defined reason for the current value of instance eligibility. Usually, this can be
   * directly mapped to the internal state. An empty reason is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Whether an instance is eligible or ineligible.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEligible() {
    return eligible;
  }

  /**
   * Whether an instance is eligible or ineligible.
   * @param eligible eligible or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility setEligible(java.lang.Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * User-defined reason for the current value of instance eligibility. Usually, this can be
   * directly mapped to the internal state. An empty reason is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * User-defined reason for the current value of instance eligibility. Usually, this can be
   * directly mapped to the internal state. An empty reason is allowed.
   * @param reason reason or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility) super.clone();
  }

}
