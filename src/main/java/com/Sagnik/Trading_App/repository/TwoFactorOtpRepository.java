package com.Sagnik.Trading_App.repository;

import com.Sagnik.Trading_App.Model.TwoFactorOTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP , String> {
    TwoFactorOTP findByUserId(Long userId);

}
