// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.outputs;

import com.pulumi.aws.ec2.SecurityGroup;
import com.pulumi.aws.ec2.SecurityGroupRule;
import com.pulumi.aws.iam.InstanceProfile;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.eks.outputs.Taint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeGroupOptions {
    /**
     * @return The AMI ID to use for the worker nodes.
     * 
     * Defaults to the latest recommended EKS Optimized Linux AMI from the AWS Systems Manager Parameter Store.
     * 
     * Note: `amiId` and `gpu` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html.
     * 
     */
    private @Nullable String amiId;
    /**
     * @return The AMI Type to use for the worker nodes.
     * 
     * Only applicable when setting an AMI ID that is of type `arm64`.
     * 
     * Note: `amiType` and `gpu` are mutually exclusive.
     * 
     */
    private @Nullable String amiType;
    /**
     * @return The tags to apply to the NodeGroup&#39;s AutoScalingGroup in the CloudFormation Stack.
     * 
     * Per AWS, all stack-level tags, including automatically created tags, and the `cloudFormationTags` option are propagated to resources that AWS CloudFormation supports, including the AutoScalingGroup. See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    private @Nullable Map<String,String> autoScalingGroupTags;
    /**
     * @return Additional args to pass directly to `/etc/eks/bootstrap.sh`. For details on available options, see: https://github.com/awslabs/amazon-eks-ami/blob/master/files/bootstrap.sh. Note that the `--apiserver-endpoint`, `--b64-cluster-ca` and `--kubelet-extra-args` flags are included automatically based on other configuration parameters.
     * 
     */
    private @Nullable String bootstrapExtraArgs;
    /**
     * @return The tags to apply to the CloudFormation Stack of the Worker NodeGroup.
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    private @Nullable Map<String,String> cloudFormationTags;
    /**
     * @return The ingress rule that gives node group access.
     * 
     */
    private @Nullable SecurityGroupRule clusterIngressRule;
    /**
     * @return The number of worker nodes that should be running in the cluster. Defaults to 2.
     * 
     */
    private @Nullable Integer desiredCapacity;
    /**
     * @return Encrypt the root block device of the nodes in the node group.
     * 
     */
    private @Nullable Boolean encryptRootBlockDevice;
    /**
     * @return Extra security groups to attach on all nodes in this worker node group.
     * 
     * This additional set of security groups captures any user application rules that will be needed for the nodes.
     * 
     */
    private @Nullable List<SecurityGroup> extraNodeSecurityGroups;
    /**
     * @return Use the latest recommended EKS Optimized Linux AMI with GPU support for the worker nodes from the AWS Systems Manager Parameter Store.
     * 
     * Defaults to false.
     * 
     * Note: `gpu` and `amiId` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html
     * - https://docs.aws.amazon.com/eks/latest/userguide/retrieve-ami-id.html
     * 
     */
    private @Nullable Boolean gpu;
    /**
     * @return The ingress rule that gives node group access.
     * 
     */
    private @Nullable InstanceProfile instanceProfile;
    /**
     * @return The instance type to use for the cluster&#39;s nodes. Defaults to &#34;t2.medium&#34;.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Name of the key pair to use for SSH access to worker nodes.
     * 
     */
    private @Nullable String keyName;
    /**
     * @return Extra args to pass to the Kubelet. Corresponds to the options passed in the `--kubeletExtraArgs` flag to `/etc/eks/bootstrap.sh`. For example, &#39;--port=10251 --address=0.0.0.0&#39;. Note that the `labels` and `taints` properties will be applied to this list (using `--node-labels` and `--register-with-taints` respectively) after to the explicit `kubeletExtraArgs`.
     * 
     */
    private @Nullable String kubeletExtraArgs;
    /**
     * @return Custom k8s node labels to be attached to each worker node. Adds the given key/value pairs to the `--node-labels` kubelet argument.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return The maximum number of worker nodes running in the cluster. Defaults to 2.
     * 
     */
    private @Nullable Integer maxSize;
    /**
     * @return The minimum number of worker nodes running in the cluster. Defaults to 1.
     * 
     */
    private @Nullable Integer minSize;
    /**
     * @return Whether or not to auto-assign public IP addresses on the EKS worker nodes. If this toggle is set to true, the EKS workers will be auto-assigned public IPs. If false, they will not be auto-assigned public IPs.
     * 
     */
    private @Nullable Boolean nodeAssociatePublicIpAddress;
    /**
     * @return Public key material for SSH access to worker nodes. See allowed formats at:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html
     * If not provided, no SSH access is enabled on VMs.
     * 
     */
    private @Nullable String nodePublicKey;
    /**
     * @return The size in GiB of a cluster node&#39;s root volume. Defaults to 20.
     * 
     */
    private @Nullable Integer nodeRootVolumeSize;
    /**
     * @return The security group for the worker node group to communicate with the cluster.
     * 
     * This security group requires specific inbound and outbound rules.
     * 
     * See for more details:
     * https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html
     * 
     * Note: The `nodeSecurityGroup` option and the cluster option`nodeSecurityGroupTags` are mutually exclusive.
     * 
     */
    private @Nullable SecurityGroup nodeSecurityGroup;
    /**
     * @return The set of subnets to override and use for the worker node group.
     * 
     * Setting this option overrides which subnets to use for the worker node group, regardless if the cluster&#39;s `subnetIds` is set, or if `publicSubnetIds` and/or `privateSubnetIds` were set.
     * 
     */
    private @Nullable List<String> nodeSubnetIds;
    /**
     * @return Extra code to run on node startup. This code will run after the AWS EKS bootstrapping code and before the node signals its readiness to the managing CloudFormation stack. This code must be a typical user data script: critically it must begin with an interpreter directive (i.e. a `#!`).
     * 
     */
    private @Nullable String nodeUserData;
    /**
     * @return User specified code to run on node startup. This code is expected to handle the full AWS EKS bootstrapping code and signal node readiness to the managing CloudFormation stack. This code must be a complete and executable user data script in bash (Linux) or powershell (Windows).
     * 
     * See for more details: https://docs.aws.amazon.com/eks/latest/userguide/worker.html
     * 
     */
    private @Nullable String nodeUserDataOverride;
    /**
     * @return Bidding price for spot instance. If set, only spot instances will be added as worker node.
     * 
     */
    private @Nullable String spotPrice;
    /**
     * @return Custom k8s node taints to be attached to each worker node. Adds the given taints to the `--register-with-taints` kubelet argument
     * 
     */
    private @Nullable Map<String,Taint> taints;
    /**
     * @return Desired Kubernetes master / control plane version. If you do not specify a value, the latest available version is used.
     * 
     */
    private @Nullable String version;

    private ClusterNodeGroupOptions() {}
    /**
     * @return The AMI ID to use for the worker nodes.
     * 
     * Defaults to the latest recommended EKS Optimized Linux AMI from the AWS Systems Manager Parameter Store.
     * 
     * Note: `amiId` and `gpu` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html.
     * 
     */
    public Optional<String> amiId() {
        return Optional.ofNullable(this.amiId);
    }
    /**
     * @return The AMI Type to use for the worker nodes.
     * 
     * Only applicable when setting an AMI ID that is of type `arm64`.
     * 
     * Note: `amiType` and `gpu` are mutually exclusive.
     * 
     */
    public Optional<String> amiType() {
        return Optional.ofNullable(this.amiType);
    }
    /**
     * @return The tags to apply to the NodeGroup&#39;s AutoScalingGroup in the CloudFormation Stack.
     * 
     * Per AWS, all stack-level tags, including automatically created tags, and the `cloudFormationTags` option are propagated to resources that AWS CloudFormation supports, including the AutoScalingGroup. See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    public Map<String,String> autoScalingGroupTags() {
        return this.autoScalingGroupTags == null ? Map.of() : this.autoScalingGroupTags;
    }
    /**
     * @return Additional args to pass directly to `/etc/eks/bootstrap.sh`. For details on available options, see: https://github.com/awslabs/amazon-eks-ami/blob/master/files/bootstrap.sh. Note that the `--apiserver-endpoint`, `--b64-cluster-ca` and `--kubelet-extra-args` flags are included automatically based on other configuration parameters.
     * 
     */
    public Optional<String> bootstrapExtraArgs() {
        return Optional.ofNullable(this.bootstrapExtraArgs);
    }
    /**
     * @return The tags to apply to the CloudFormation Stack of the Worker NodeGroup.
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    public Map<String,String> cloudFormationTags() {
        return this.cloudFormationTags == null ? Map.of() : this.cloudFormationTags;
    }
    /**
     * @return The ingress rule that gives node group access.
     * 
     */
    public Optional<SecurityGroupRule> clusterIngressRule() {
        return Optional.ofNullable(this.clusterIngressRule);
    }
    /**
     * @return The number of worker nodes that should be running in the cluster. Defaults to 2.
     * 
     */
    public Optional<Integer> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }
    /**
     * @return Encrypt the root block device of the nodes in the node group.
     * 
     */
    public Optional<Boolean> encryptRootBlockDevice() {
        return Optional.ofNullable(this.encryptRootBlockDevice);
    }
    /**
     * @return Extra security groups to attach on all nodes in this worker node group.
     * 
     * This additional set of security groups captures any user application rules that will be needed for the nodes.
     * 
     */
    public List<SecurityGroup> extraNodeSecurityGroups() {
        return this.extraNodeSecurityGroups == null ? List.of() : this.extraNodeSecurityGroups;
    }
    /**
     * @return Use the latest recommended EKS Optimized Linux AMI with GPU support for the worker nodes from the AWS Systems Manager Parameter Store.
     * 
     * Defaults to false.
     * 
     * Note: `gpu` and `amiId` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html
     * - https://docs.aws.amazon.com/eks/latest/userguide/retrieve-ami-id.html
     * 
     */
    public Optional<Boolean> gpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * @return The ingress rule that gives node group access.
     * 
     */
    public Optional<InstanceProfile> instanceProfile() {
        return Optional.ofNullable(this.instanceProfile);
    }
    /**
     * @return The instance type to use for the cluster&#39;s nodes. Defaults to &#34;t2.medium&#34;.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Name of the key pair to use for SSH access to worker nodes.
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * @return Extra args to pass to the Kubelet. Corresponds to the options passed in the `--kubeletExtraArgs` flag to `/etc/eks/bootstrap.sh`. For example, &#39;--port=10251 --address=0.0.0.0&#39;. Note that the `labels` and `taints` properties will be applied to this list (using `--node-labels` and `--register-with-taints` respectively) after to the explicit `kubeletExtraArgs`.
     * 
     */
    public Optional<String> kubeletExtraArgs() {
        return Optional.ofNullable(this.kubeletExtraArgs);
    }
    /**
     * @return Custom k8s node labels to be attached to each worker node. Adds the given key/value pairs to the `--node-labels` kubelet argument.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The maximum number of worker nodes running in the cluster. Defaults to 2.
     * 
     */
    public Optional<Integer> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    /**
     * @return The minimum number of worker nodes running in the cluster. Defaults to 1.
     * 
     */
    public Optional<Integer> minSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * @return Whether or not to auto-assign public IP addresses on the EKS worker nodes. If this toggle is set to true, the EKS workers will be auto-assigned public IPs. If false, they will not be auto-assigned public IPs.
     * 
     */
    public Optional<Boolean> nodeAssociatePublicIpAddress() {
        return Optional.ofNullable(this.nodeAssociatePublicIpAddress);
    }
    /**
     * @return Public key material for SSH access to worker nodes. See allowed formats at:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html
     * If not provided, no SSH access is enabled on VMs.
     * 
     */
    public Optional<String> nodePublicKey() {
        return Optional.ofNullable(this.nodePublicKey);
    }
    /**
     * @return The size in GiB of a cluster node&#39;s root volume. Defaults to 20.
     * 
     */
    public Optional<Integer> nodeRootVolumeSize() {
        return Optional.ofNullable(this.nodeRootVolumeSize);
    }
    /**
     * @return The security group for the worker node group to communicate with the cluster.
     * 
     * This security group requires specific inbound and outbound rules.
     * 
     * See for more details:
     * https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html
     * 
     * Note: The `nodeSecurityGroup` option and the cluster option`nodeSecurityGroupTags` are mutually exclusive.
     * 
     */
    public Optional<SecurityGroup> nodeSecurityGroup() {
        return Optional.ofNullable(this.nodeSecurityGroup);
    }
    /**
     * @return The set of subnets to override and use for the worker node group.
     * 
     * Setting this option overrides which subnets to use for the worker node group, regardless if the cluster&#39;s `subnetIds` is set, or if `publicSubnetIds` and/or `privateSubnetIds` were set.
     * 
     */
    public List<String> nodeSubnetIds() {
        return this.nodeSubnetIds == null ? List.of() : this.nodeSubnetIds;
    }
    /**
     * @return Extra code to run on node startup. This code will run after the AWS EKS bootstrapping code and before the node signals its readiness to the managing CloudFormation stack. This code must be a typical user data script: critically it must begin with an interpreter directive (i.e. a `#!`).
     * 
     */
    public Optional<String> nodeUserData() {
        return Optional.ofNullable(this.nodeUserData);
    }
    /**
     * @return User specified code to run on node startup. This code is expected to handle the full AWS EKS bootstrapping code and signal node readiness to the managing CloudFormation stack. This code must be a complete and executable user data script in bash (Linux) or powershell (Windows).
     * 
     * See for more details: https://docs.aws.amazon.com/eks/latest/userguide/worker.html
     * 
     */
    public Optional<String> nodeUserDataOverride() {
        return Optional.ofNullable(this.nodeUserDataOverride);
    }
    /**
     * @return Bidding price for spot instance. If set, only spot instances will be added as worker node.
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * @return Custom k8s node taints to be attached to each worker node. Adds the given taints to the `--register-with-taints` kubelet argument
     * 
     */
    public Map<String,Taint> taints() {
        return this.taints == null ? Map.of() : this.taints;
    }
    /**
     * @return Desired Kubernetes master / control plane version. If you do not specify a value, the latest available version is used.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String amiId;
        private @Nullable String amiType;
        private @Nullable Map<String,String> autoScalingGroupTags;
        private @Nullable String bootstrapExtraArgs;
        private @Nullable Map<String,String> cloudFormationTags;
        private @Nullable SecurityGroupRule clusterIngressRule;
        private @Nullable Integer desiredCapacity;
        private @Nullable Boolean encryptRootBlockDevice;
        private @Nullable List<SecurityGroup> extraNodeSecurityGroups;
        private @Nullable Boolean gpu;
        private @Nullable InstanceProfile instanceProfile;
        private @Nullable String instanceType;
        private @Nullable String keyName;
        private @Nullable String kubeletExtraArgs;
        private @Nullable Map<String,String> labels;
        private @Nullable Integer maxSize;
        private @Nullable Integer minSize;
        private @Nullable Boolean nodeAssociatePublicIpAddress;
        private @Nullable String nodePublicKey;
        private @Nullable Integer nodeRootVolumeSize;
        private @Nullable SecurityGroup nodeSecurityGroup;
        private @Nullable List<String> nodeSubnetIds;
        private @Nullable String nodeUserData;
        private @Nullable String nodeUserDataOverride;
        private @Nullable String spotPrice;
        private @Nullable Map<String,Taint> taints;
        private @Nullable String version;
        public Builder() {}
        public Builder(ClusterNodeGroupOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiId = defaults.amiId;
    	      this.amiType = defaults.amiType;
    	      this.autoScalingGroupTags = defaults.autoScalingGroupTags;
    	      this.bootstrapExtraArgs = defaults.bootstrapExtraArgs;
    	      this.cloudFormationTags = defaults.cloudFormationTags;
    	      this.clusterIngressRule = defaults.clusterIngressRule;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.encryptRootBlockDevice = defaults.encryptRootBlockDevice;
    	      this.extraNodeSecurityGroups = defaults.extraNodeSecurityGroups;
    	      this.gpu = defaults.gpu;
    	      this.instanceProfile = defaults.instanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.kubeletExtraArgs = defaults.kubeletExtraArgs;
    	      this.labels = defaults.labels;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.nodeAssociatePublicIpAddress = defaults.nodeAssociatePublicIpAddress;
    	      this.nodePublicKey = defaults.nodePublicKey;
    	      this.nodeRootVolumeSize = defaults.nodeRootVolumeSize;
    	      this.nodeSecurityGroup = defaults.nodeSecurityGroup;
    	      this.nodeSubnetIds = defaults.nodeSubnetIds;
    	      this.nodeUserData = defaults.nodeUserData;
    	      this.nodeUserDataOverride = defaults.nodeUserDataOverride;
    	      this.spotPrice = defaults.spotPrice;
    	      this.taints = defaults.taints;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder amiId(@Nullable String amiId) {
            this.amiId = amiId;
            return this;
        }
        @CustomType.Setter
        public Builder amiType(@Nullable String amiType) {
            this.amiType = amiType;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalingGroupTags(@Nullable Map<String,String> autoScalingGroupTags) {
            this.autoScalingGroupTags = autoScalingGroupTags;
            return this;
        }
        @CustomType.Setter
        public Builder bootstrapExtraArgs(@Nullable String bootstrapExtraArgs) {
            this.bootstrapExtraArgs = bootstrapExtraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder cloudFormationTags(@Nullable Map<String,String> cloudFormationTags) {
            this.cloudFormationTags = cloudFormationTags;
            return this;
        }
        @CustomType.Setter
        public Builder clusterIngressRule(@Nullable SecurityGroupRule clusterIngressRule) {
            this.clusterIngressRule = clusterIngressRule;
            return this;
        }
        @CustomType.Setter
        public Builder desiredCapacity(@Nullable Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder encryptRootBlockDevice(@Nullable Boolean encryptRootBlockDevice) {
            this.encryptRootBlockDevice = encryptRootBlockDevice;
            return this;
        }
        @CustomType.Setter
        public Builder extraNodeSecurityGroups(@Nullable List<SecurityGroup> extraNodeSecurityGroups) {
            this.extraNodeSecurityGroups = extraNodeSecurityGroups;
            return this;
        }
        public Builder extraNodeSecurityGroups(SecurityGroup... extraNodeSecurityGroups) {
            return extraNodeSecurityGroups(List.of(extraNodeSecurityGroups));
        }
        @CustomType.Setter
        public Builder gpu(@Nullable Boolean gpu) {
            this.gpu = gpu;
            return this;
        }
        @CustomType.Setter
        public Builder instanceProfile(@Nullable InstanceProfile instanceProfile) {
            this.instanceProfile = instanceProfile;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        @CustomType.Setter
        public Builder kubeletExtraArgs(@Nullable String kubeletExtraArgs) {
            this.kubeletExtraArgs = kubeletExtraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        @CustomType.Setter
        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        @CustomType.Setter
        public Builder nodeAssociatePublicIpAddress(@Nullable Boolean nodeAssociatePublicIpAddress) {
            this.nodeAssociatePublicIpAddress = nodeAssociatePublicIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder nodePublicKey(@Nullable String nodePublicKey) {
            this.nodePublicKey = nodePublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder nodeRootVolumeSize(@Nullable Integer nodeRootVolumeSize) {
            this.nodeRootVolumeSize = nodeRootVolumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSecurityGroup(@Nullable SecurityGroup nodeSecurityGroup) {
            this.nodeSecurityGroup = nodeSecurityGroup;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSubnetIds(@Nullable List<String> nodeSubnetIds) {
            this.nodeSubnetIds = nodeSubnetIds;
            return this;
        }
        public Builder nodeSubnetIds(String... nodeSubnetIds) {
            return nodeSubnetIds(List.of(nodeSubnetIds));
        }
        @CustomType.Setter
        public Builder nodeUserData(@Nullable String nodeUserData) {
            this.nodeUserData = nodeUserData;
            return this;
        }
        @CustomType.Setter
        public Builder nodeUserDataOverride(@Nullable String nodeUserDataOverride) {
            this.nodeUserDataOverride = nodeUserDataOverride;
            return this;
        }
        @CustomType.Setter
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        @CustomType.Setter
        public Builder taints(@Nullable Map<String,Taint> taints) {
            this.taints = taints;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ClusterNodeGroupOptions build() {
            final var o = new ClusterNodeGroupOptions();
            o.amiId = amiId;
            o.amiType = amiType;
            o.autoScalingGroupTags = autoScalingGroupTags;
            o.bootstrapExtraArgs = bootstrapExtraArgs;
            o.cloudFormationTags = cloudFormationTags;
            o.clusterIngressRule = clusterIngressRule;
            o.desiredCapacity = desiredCapacity;
            o.encryptRootBlockDevice = encryptRootBlockDevice;
            o.extraNodeSecurityGroups = extraNodeSecurityGroups;
            o.gpu = gpu;
            o.instanceProfile = instanceProfile;
            o.instanceType = instanceType;
            o.keyName = keyName;
            o.kubeletExtraArgs = kubeletExtraArgs;
            o.labels = labels;
            o.maxSize = maxSize;
            o.minSize = minSize;
            o.nodeAssociatePublicIpAddress = nodeAssociatePublicIpAddress;
            o.nodePublicKey = nodePublicKey;
            o.nodeRootVolumeSize = nodeRootVolumeSize;
            o.nodeSecurityGroup = nodeSecurityGroup;
            o.nodeSubnetIds = nodeSubnetIds;
            o.nodeUserData = nodeUserData;
            o.nodeUserDataOverride = nodeUserDataOverride;
            o.spotPrice = spotPrice;
            o.taints = taints;
            o.version = version;
            return o;
        }
    }
}
