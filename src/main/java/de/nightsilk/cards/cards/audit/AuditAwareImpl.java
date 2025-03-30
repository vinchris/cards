package de.nightsilk.cards.cards.audit;

import de.nightsilk.cards.cards.entity.BaseEntity;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * Implementation of the {@link AuditorAware} interface that is used to determine the current user of the
 * Cards REST API. The current user is used to populate the "created_by" and "updated_by" fields in the database
 * entries of the {@link BaseEntity} class.
 *
 * @author Cristian Vintilescu
 */
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current auditor, which is the application identifier of the Cards REST API.
     *
     * @return an {@link Optional} containing the current auditor, or an empty {@link Optional} if the
     *         auditor is unknown
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
