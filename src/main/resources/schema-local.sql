CREATE TABLE contest (
    contest_id      VARCHAR(32) PRIMARY KEY,
    name            VARCHAR(128) NOT NULL
);

CREATE TABLE task (
    contest_id      VARCHAR(32) NOT NULL,
    task            VARCHAR(128) NOT NULL,
    url             VARCHAR(128) NOT NULL,
    CONSTRAINT FK_contest_task FOREIGN KEY (contest_id) REFERENCES contest(contest_id),
    CONSTRAINT PK_task PRIMARY KEY (contest_id, task)
);

CREATE TABLE algorithm (
    algorithm_id    INTEGER PRIMARY KEY,
    name_jp         VARCHAR(128) NOT NULL,
    name_en         VARCHAR(128)
);

CREATE TABLE label (
    label_id        INTEGER PRIMARY KEY,
    contest_id      VARCHAR(32) NOT NULL,
    task            VARCHAR(128) NOT NULL,
    algorithm_id    INTEGER NOT NULL,
    CONSTRAINT FK_task_label FOREIGN KEY (contest_id, task) REFERENCES task(contest_id, task),
    CONSTRAINT FK_algorithm_label FOREIGN KEY (algorithm_id) REFERENCES algorithm(algorithm_id)
);
