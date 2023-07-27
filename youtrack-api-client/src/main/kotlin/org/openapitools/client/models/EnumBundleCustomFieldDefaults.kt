/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.BundleCustomFieldDefaults
import org.openapitools.client.models.CustomField
import org.openapitools.client.models.EnumBundle
import org.openapitools.client.models.EnumBundleElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Default settings for the enum-type field.
 *
 * @param id 
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param dollarType 
 * @param bundle 
 * @param defaultValues 
 */


data class EnumBundleCustomFieldDefaults (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "canBeEmpty")
    override val canBeEmpty: kotlin.Boolean? = null,

    @Json(name = "emptyFieldText")
    override val emptyFieldText: kotlin.String? = null,

    @Json(name = "isPublic")
    override val isPublic: kotlin.Boolean? = null,

    @Json(name = "parent")
    override val parent: CustomField? = null,

    @Json(name = "\$type")
    override val dollarType: kotlin.String? = null,

    @Json(name = "bundle")
    val bundle: EnumBundle? = null,

    @Json(name = "defaultValues")
    val defaultValues: kotlin.collections.List<EnumBundleElement>? = null

) : BundleCustomFieldDefaults

