
# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional] [readonly]
**attachments** | [**kotlin.collections.List&lt;IssueAttachment&gt;**](IssueAttachment.md) |  |  [optional]
**comments** | [**kotlin.collections.List&lt;IssueComment&gt;**](IssueComment.md) |  |  [optional]
**commentsCount** | **kotlin.Int** |  |  [optional] [readonly]
**created** | **kotlin.Long** |  |  [optional] [readonly]
**customFields** | [**kotlin.collections.List&lt;IssueCustomField&gt;**](IssueCustomField.md) |  |  [optional] [readonly]
**description** | **kotlin.String** |  |  [optional]
**draftOwner** | [**User**](User.md) |  |  [optional]
**externalIssue** | [**ExternalIssue**](ExternalIssue.md) |  |  [optional]
**idReadable** | **kotlin.String** |  |  [optional] [readonly]
**isDraft** | **kotlin.Boolean** |  |  [optional] [readonly]
**links** | [**kotlin.collections.List&lt;IssueLink&gt;**](IssueLink.md) |  |  [optional] [readonly]
**numberInProject** | **kotlin.Long** |  |  [optional] [readonly]
**parent** | [**IssueLink**](IssueLink.md) |  |  [optional]
**project** | [**Project**](Project.md) |  |  [optional]
**reporter** | [**User**](User.md) |  |  [optional]
**resolved** | **kotlin.Long** |  |  [optional] [readonly]
**subtasks** | [**IssueLink**](IssueLink.md) |  |  [optional]
**summary** | **kotlin.String** |  |  [optional]
**tags** | [**kotlin.collections.List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**updated** | **kotlin.Long** |  |  [optional] [readonly]
**updater** | [**User**](User.md) |  |  [optional]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**voters** | [**IssueVoters**](IssueVoters.md) |  |  [optional]
**votes** | **kotlin.Int** |  |  [optional] [readonly]
**watchers** | [**IssueWatchers**](IssueWatchers.md) |  |  [optional]
**wikifiedDescription** | **kotlin.String** |  |  [optional] [readonly]
**dollarType** | **kotlin.String** |  |  [optional] [readonly]



