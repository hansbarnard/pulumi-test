// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.mycompany.ipidp.awsecsservice.bluegreen;

import com.mycompany.ipidp.Utilities;
import com.mycompany.ipidp.awsecsservice.bluegreen.CodeDeployArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import javax.annotation.Nullable;

@ResourceType(type="ipidp:aws_ecs_service/blue_green:CodeDeploy")
public class CodeDeploy extends com.pulumi.resources.ComponentResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CodeDeploy(String name) {
        this(name, CodeDeployArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CodeDeploy(String name, @Nullable CodeDeployArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CodeDeploy(String name, @Nullable CodeDeployArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("ipidp:aws_ecs_service/blue_green:CodeDeploy", name, args == null ? CodeDeployArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
