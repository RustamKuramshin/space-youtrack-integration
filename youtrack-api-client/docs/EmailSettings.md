
# EmailSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional] [readonly]
**isEnabled** | **kotlin.Boolean** |  |  [optional]
**host** | **kotlin.String** |  |  [optional]
**port** | **kotlin.Int** |  |  [optional]
**mailProtocol** | [**inline**](#MailProtocol) |  |  [optional]
**anonymous** | **kotlin.Boolean** |  |  [optional]
**login** | **kotlin.String** |  |  [optional]
**sslKey** | [**StorageEntry**](StorageEntry.md) |  |  [optional]
**from** | **kotlin.String** |  |  [optional]
**replyTo** | **kotlin.String** |  |  [optional]
**dollarType** | **kotlin.String** |  |  [optional] [readonly]


<a id="MailProtocol"></a>
## Enum: mailProtocol
Name | Value
---- | -----
mailProtocol | SMTP, SMTPS, SMTP_TLS



