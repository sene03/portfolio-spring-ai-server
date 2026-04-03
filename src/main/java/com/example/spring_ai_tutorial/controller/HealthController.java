package com.example.spring_ai_tutorial.controller;

import com.example.spring_ai_tutorial.domain.dto.ApiResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
@Tag(name = "Health API", description = "서버 상태 확인")
public class HealthController {

    @Operation(summary = "헬스 체크", description = "서버 상태를 확인합니다.")
    @GetMapping
    public ResponseEntity<ApiResponseDto<Map<String, String>>> health() {
        return ResponseEntity.ok(ApiResponseDto.success(Map.of("status", "ok")));
    }
}
