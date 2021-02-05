package io.prometheus.jmx;

public class CertificateExpiry implements CertificateExpiryMBean {
    private final long expiryDaysCount;

    public CertificateExpiry(long expiryDaysCount) {
        this.expiryDaysCount = expiryDaysCount;
    }

    @Override
    public long getDaysCount() {
        return expiryDaysCount;
    }
}
