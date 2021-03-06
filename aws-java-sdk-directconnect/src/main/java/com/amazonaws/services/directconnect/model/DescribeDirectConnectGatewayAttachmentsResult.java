/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response from the DescribeDirectConnectGatewayAttachments API call
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDirectConnectGatewayAttachmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the direct connect gateway attachments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAttachment> directConnectGatewayAttachments;

    private String nextToken;

    /**
     * <p>
     * Information about the direct connect gateway attachments.
     * </p>
     * 
     * @return Information about the direct connect gateway attachments.
     */

    public java.util.List<DirectConnectGatewayAttachment> getDirectConnectGatewayAttachments() {
        if (directConnectGatewayAttachments == null) {
            directConnectGatewayAttachments = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAttachment>();
        }
        return directConnectGatewayAttachments;
    }

    /**
     * <p>
     * Information about the direct connect gateway attachments.
     * </p>
     * 
     * @param directConnectGatewayAttachments
     *        Information about the direct connect gateway attachments.
     */

    public void setDirectConnectGatewayAttachments(java.util.Collection<DirectConnectGatewayAttachment> directConnectGatewayAttachments) {
        if (directConnectGatewayAttachments == null) {
            this.directConnectGatewayAttachments = null;
            return;
        }

        this.directConnectGatewayAttachments = new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAttachment>(directConnectGatewayAttachments);
    }

    /**
     * <p>
     * Information about the direct connect gateway attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectConnectGatewayAttachments(java.util.Collection)} or
     * {@link #withDirectConnectGatewayAttachments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param directConnectGatewayAttachments
     *        Information about the direct connect gateway attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAttachmentsResult withDirectConnectGatewayAttachments(DirectConnectGatewayAttachment... directConnectGatewayAttachments) {
        if (this.directConnectGatewayAttachments == null) {
            setDirectConnectGatewayAttachments(new com.amazonaws.internal.SdkInternalList<DirectConnectGatewayAttachment>(
                    directConnectGatewayAttachments.length));
        }
        for (DirectConnectGatewayAttachment ele : directConnectGatewayAttachments) {
            this.directConnectGatewayAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the direct connect gateway attachments.
     * </p>
     * 
     * @param directConnectGatewayAttachments
     *        Information about the direct connect gateway attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAttachmentsResult withDirectConnectGatewayAttachments(
            java.util.Collection<DirectConnectGatewayAttachment> directConnectGatewayAttachments) {
        setDirectConnectGatewayAttachments(directConnectGatewayAttachments);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDirectConnectGatewayAttachmentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectConnectGatewayAttachments() != null)
            sb.append("DirectConnectGatewayAttachments: ").append(getDirectConnectGatewayAttachments()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAttachmentsResult == false)
            return false;
        DescribeDirectConnectGatewayAttachmentsResult other = (DescribeDirectConnectGatewayAttachmentsResult) obj;
        if (other.getDirectConnectGatewayAttachments() == null ^ this.getDirectConnectGatewayAttachments() == null)
            return false;
        if (other.getDirectConnectGatewayAttachments() != null
                && other.getDirectConnectGatewayAttachments().equals(this.getDirectConnectGatewayAttachments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayAttachments() == null) ? 0 : getDirectConnectGatewayAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDirectConnectGatewayAttachmentsResult clone() {
        try {
            return (DescribeDirectConnectGatewayAttachmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
