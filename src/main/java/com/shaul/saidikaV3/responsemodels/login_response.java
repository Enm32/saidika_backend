package com.shaul.saidikaV3.responsemodels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class login_response {
    private Boolean twoFactorEnabled;
    private String message;
    private String Authorization;
}
