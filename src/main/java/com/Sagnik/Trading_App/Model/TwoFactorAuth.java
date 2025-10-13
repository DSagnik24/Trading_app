package com.Sagnik.Trading_App.Model;

import com.Sagnik.Trading_App.domain.VerificationType;
import lombok.Data;


@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
