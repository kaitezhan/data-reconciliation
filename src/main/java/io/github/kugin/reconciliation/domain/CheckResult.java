package io.github.kugin.reconciliation.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 对账结果
 *
 * @author Kugin
 */
@Data
@Builder
public class CheckResult {

    /**
     * 上游数据中不相同的数据
     */
    private Map<String, CheckEntry> sourceDiffMap;

    /**
     * 下游数据中不相同的数据
     */
    private Map<String, CheckEntry> targetDiffMap;

    /**
     * source 与 target 的详细差异
     */
    private List<CheckUnit> diffDetails;
}
